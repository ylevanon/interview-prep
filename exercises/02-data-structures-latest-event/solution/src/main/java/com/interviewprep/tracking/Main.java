package com.interviewprep.tracking;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<TrackingEvent> events = List.of(
                new TrackingEvent("shipment-1", Instant.parse("2026-05-02T10:00:00Z"), "Yuma", "IN_TRANSIT"),
                new TrackingEvent("shipment-1", Instant.parse("2026-05-01T10:00:00Z"), "San Diego", "CREATED"),
                new TrackingEvent("shipment-2", Instant.parse("2026-05-03T10:00:00Z"), "Phoenix", "DELIVERED")
        );

        Map<String, TrackingEvent> latest = new TrackingEventService().latestEventByShipmentId(events);
        System.out.println("Latest event count: " + latest.size());
        System.out.println("shipment-1 latest location: " + latest.get("shipment-1").location());
    }
}
