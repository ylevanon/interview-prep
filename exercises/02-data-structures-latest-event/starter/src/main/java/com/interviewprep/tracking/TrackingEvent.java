package com.interviewprep.tracking;

import java.time.Instant;

public record TrackingEvent(
        String shipmentId,
        Instant timestamp,
        String location,
        String status
) {
}
