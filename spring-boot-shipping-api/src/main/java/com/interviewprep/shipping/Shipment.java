package com.interviewprep.shipping;

import java.util.List;

public record Shipment(
        String id,
        String customerId,
        String origin,
        String destination,
        ShipmentStatus status,
        List<TrackingEvent> trackingEvents
) {
}
