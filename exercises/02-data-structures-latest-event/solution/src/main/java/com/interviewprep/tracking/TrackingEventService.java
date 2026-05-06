package com.interviewprep.tracking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingEventService {
    public Map<String, TrackingEvent> latestEventByShipmentId(List<TrackingEvent> events) {
        Map<String, TrackingEvent> latestByShipmentId = new HashMap<>();

        for (TrackingEvent event : events) {
            TrackingEvent currentLatest = latestByShipmentId.get(event.shipmentId());
            if (currentLatest == null || event.timestamp().isAfter(currentLatest.timestamp())) {
                latestByShipmentId.put(event.shipmentId(), event);
            }
        }

        return latestByShipmentId;
    }
}
