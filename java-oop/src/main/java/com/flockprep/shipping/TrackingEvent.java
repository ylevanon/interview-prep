package com.flockprep.shipping;

import java.time.Instant;

public class TrackingEvent {
    private final String shipmentId;
    private final Instant timestamp;
    private final String location;
    private final String description;
    private final ShipmentStatus status;

    public TrackingEvent(String shipmentId, Instant timestamp, String location, String description, ShipmentStatus status) {
        this.shipmentId = shipmentId;
        this.timestamp = timestamp;
        this.location = location;
        this.description = description;
        this.status = status;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public ShipmentStatus getStatus() {
        return status;
    }
}
