package com.interviewprep.shipping;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Shipment shipment = new Shipment("shipment-1", "customer-1", "San Diego", "Phoenix", ShipmentStatus.CREATED);
        shipment.addTrackingEvent(new TrackingEvent(
                "shipment-1",
                Instant.parse("2026-05-01T10:00:00Z"),
                "San Diego",
                "Shipment created",
                ShipmentStatus.CREATED
        ));
        shipment.addTrackingEvent(new TrackingEvent(
                "shipment-1",
                Instant.parse("2026-05-02T10:00:00Z"),
                "Yuma",
                "Shipment is in transit",
                ShipmentStatus.IN_TRANSIT
        ));

        ShipmentTrackingService service = new ShipmentTrackingService();
        TrackingEvent latest = service.latestEventForCustomer(shipment, "customer-1")
                .orElseThrow(() -> new IllegalStateException("No tracking events found"));

        System.out.println("Latest event: " + latest.getStatus() + " in " + latest.getLocation());
    }
}
