package com.interviewprep.shipping;

public class ShipmentTrackingService {
    private final ShipmentRepository shipmentRepository;

    public ShipmentTrackingService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public ShipmentStatusResponse getLatestStatus(String customerId, String shipmentId) {
        // TODO: find shipment or throw not found.
        // TODO: reject access if customerId does not own shipment.
        // TODO: find latest event by timestamp and return ShipmentStatusResponse.
        return null;
    }
}
