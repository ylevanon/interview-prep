package com.interviewprep.shipping;

import java.util.Optional;

public class ShipmentTrackingService {
    public Optional<TrackingEvent> latestEventForCustomer(Shipment shipment, String requestingCustomerId) {
        // TODO: reject access if the shipment does not belong to requestingCustomerId.
        // TODO: scan shipment.getTrackingEvents() and return the event with the latest timestamp.
        return Optional.empty();
    }
}
