package com.interviewprep.shipping;

import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class ShipmentTrackingService {
    private final ShipmentRepository shipmentRepository;

    public ShipmentTrackingService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public ShipmentStatusResponse getLatestStatus(String customerId, String shipmentId) {
        Shipment shipment = shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));

        if (!shipment.customerId().equals(customerId)) {
            throw new ShipmentAccessDeniedException();
        }

        TrackingEvent latestEvent = shipment.trackingEvents().stream()
                .max(Comparator.comparing(TrackingEvent::timestamp))
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));

        return ShipmentStatusResponse.from(latestEvent);
    }
}
