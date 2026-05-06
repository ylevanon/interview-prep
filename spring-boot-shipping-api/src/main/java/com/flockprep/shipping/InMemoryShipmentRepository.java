package com.flockprep.shipping;

import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryShipmentRepository implements ShipmentRepository {
    private final Map<String, Shipment> shipments = Map.of(
            "shipment-1",
            new Shipment(
                    "shipment-1",
                    "customer-1",
                    "San Diego",
                    "Phoenix",
                    ShipmentStatus.IN_TRANSIT,
                    List.of(
                            new TrackingEvent(
                                    "shipment-1",
                                    Instant.parse("2026-05-01T10:00:00Z"),
                                    "San Diego",
                                    "Shipment created",
                                    ShipmentStatus.CREATED
                            ),
                            new TrackingEvent(
                                    "shipment-1",
                                    Instant.parse("2026-05-02T10:00:00Z"),
                                    "Yuma",
                                    "Shipment is in transit",
                                    ShipmentStatus.IN_TRANSIT
                            )
                    )
            )
    );

    @Override
    public Optional<Shipment> findById(String shipmentId) {
        return Optional.ofNullable(shipments.get(shipmentId));
    }
}
