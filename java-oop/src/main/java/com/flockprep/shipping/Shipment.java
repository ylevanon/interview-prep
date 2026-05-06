package com.flockprep.shipping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shipment {
    private final String id;
    private final String customerId;
    private final String origin;
    private final String destination;
    private ShipmentStatus status;
    private final List<TrackingEvent> trackingEvents = new ArrayList<>();

    public Shipment(String id, String customerId, String origin, String destination, ShipmentStatus status) {
        this.id = id;
        this.customerId = customerId;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
    }

    public void addTrackingEvent(TrackingEvent event) {
        if (!id.equals(event.getShipmentId())) {
            throw new IllegalArgumentException("Tracking event shipment ID does not match shipment");
        }

        trackingEvents.add(event);
        status = event.getStatus();
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public List<TrackingEvent> getTrackingEvents() {
        return Collections.unmodifiableList(trackingEvents);
    }
}
