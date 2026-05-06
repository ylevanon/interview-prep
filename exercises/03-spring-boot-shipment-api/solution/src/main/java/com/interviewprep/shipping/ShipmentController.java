package com.interviewprep.shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers/{customerId}/shipments")
public class ShipmentController {
    private final ShipmentTrackingService shipmentTrackingService;

    public ShipmentController(ShipmentTrackingService shipmentTrackingService) {
        this.shipmentTrackingService = shipmentTrackingService;
    }

    @GetMapping("/{shipmentId}/latest-status")
    public ShipmentStatusResponse getLatestStatus(
            @PathVariable String customerId,
            @PathVariable String shipmentId
    ) {
        return shipmentTrackingService.getLatestStatus(customerId, shipmentId);
    }
}
