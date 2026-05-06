package com.interviewprep.shipping;

public class ShipmentController {
    private final ShipmentTrackingService shipmentTrackingService;

    public ShipmentController(ShipmentTrackingService shipmentTrackingService) {
        this.shipmentTrackingService = shipmentTrackingService;
    }

    // TODO: In Spring Boot, annotate this class with @RestController and @RequestMapping.
    // TODO: Add a GET endpoint for /{shipmentId}/latest-status.
    public ShipmentStatusResponse getLatestStatus(String customerId, String shipmentId) {
        return shipmentTrackingService.getLatestStatus(customerId, shipmentId);
    }
}
