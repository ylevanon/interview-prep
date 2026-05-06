package com.interviewprep.shipping;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShipmentTrackingServiceTest {
    @Test
    void returnsLatestStatusForShipmentOwner() {
        ShipmentRepository repository = shipmentId -> Optional.of(new Shipment(
                "shipment-1",
                "customer-1",
                "San Diego",
                "Phoenix",
                ShipmentStatus.IN_TRANSIT,
                List.of(
                        new TrackingEvent("shipment-1", Instant.parse("2026-05-01T10:00:00Z"), "San Diego", "Created", ShipmentStatus.CREATED),
                        new TrackingEvent("shipment-1", Instant.parse("2026-05-02T10:00:00Z"), "Yuma", "In transit", ShipmentStatus.IN_TRANSIT)
                )
        ));
        ShipmentTrackingService service = new ShipmentTrackingService(repository);

        ShipmentStatusResponse response = service.getLatestStatus("customer-1", "shipment-1");

        assertEquals(ShipmentStatus.IN_TRANSIT, response.status());
        assertEquals("Yuma", response.location());
    }

    @Test
    void rejectsAccessForDifferentCustomer() {
        ShipmentRepository repository = shipmentId -> Optional.of(new Shipment(
                "shipment-1",
                "customer-1",
                "San Diego",
                "Phoenix",
                ShipmentStatus.CREATED,
                List.of()
        ));
        ShipmentTrackingService service = new ShipmentTrackingService(repository);

        assertThrows(ShipmentAccessDeniedException.class, () -> service.getLatestStatus("customer-2", "shipment-1"));
    }
}
