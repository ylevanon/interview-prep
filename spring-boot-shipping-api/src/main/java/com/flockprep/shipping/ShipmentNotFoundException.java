package com.flockprep.shipping;

public class ShipmentNotFoundException extends RuntimeException {
    public ShipmentNotFoundException(String shipmentId) {
        super("Shipment not found: " + shipmentId);
    }
}
