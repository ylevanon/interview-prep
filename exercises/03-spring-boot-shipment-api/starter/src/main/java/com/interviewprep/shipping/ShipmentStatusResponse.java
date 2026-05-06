package com.interviewprep.shipping;

import java.time.Instant;

public record ShipmentStatusResponse(String shipmentId, ShipmentStatus status, String location, String description, Instant timestamp) {
    public static ShipmentStatusResponse from(TrackingEvent event) {
        // TODO: map TrackingEvent fields to response fields.
        return null;
    }
}
