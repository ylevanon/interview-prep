package com.interviewprep.shipping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ShipmentTrackingService {
    public Optional<TrackingEvent> latestEventForCustomer(Shipment shipment, String requestingCustomerId) {
        if (!shipment.getCustomerId().equals(requestingCustomerId)) {
            throw new SecurityException("Customer cannot access this shipment");
        }

        TrackingEvent latest = null;
        for (TrackingEvent event : shipment.getTrackingEvents()) {
            if (latest == null || event.getTimestamp().isAfter(latest.getTimestamp())) {
                latest = event;
            }
        }

        return Optional.ofNullable(latest);
    }

    public Map<String, TrackingEvent> latestEventByShipmentId(List<TrackingEvent> events) {
        Map<String, TrackingEvent> latestByShipmentId = new HashMap<>();

        for (TrackingEvent event : events) {
            TrackingEvent currentLatest = latestByShipmentId.get(event.getShipmentId());
            if (currentLatest == null || event.getTimestamp().isAfter(currentLatest.getTimestamp())) {
                latestByShipmentId.put(event.getShipmentId(), event);
            }
        }

        return latestByShipmentId;
    }
}
