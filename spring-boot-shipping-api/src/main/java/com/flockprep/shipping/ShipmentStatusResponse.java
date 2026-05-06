package com.flockprep.shipping;

import java.time.Instant;

public record ShipmentStatusResponse(
        String shipmentId,
        ShipmentStatus status,
        String location,
        String description,
        Instant timestamp
) {
    public static ShipmentStatusResponse from(TrackingEvent event) {
        return new ShipmentStatusResponse(
                event.shipmentId(),
                event.status(),
                event.location(),
                event.description(),
                event.timestamp()
        );
    }
}
