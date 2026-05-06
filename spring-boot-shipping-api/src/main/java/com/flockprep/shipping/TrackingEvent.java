package com.flockprep.shipping;

import java.time.Instant;

public record TrackingEvent(
        String shipmentId,
        Instant timestamp,
        String location,
        String description,
        ShipmentStatus status
) {
}
