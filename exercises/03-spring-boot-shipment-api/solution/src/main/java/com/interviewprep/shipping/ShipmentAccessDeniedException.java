package com.interviewprep.shipping;

public class ShipmentAccessDeniedException extends RuntimeException {
    public ShipmentAccessDeniedException() {
        super("Customer cannot access this shipment");
    }
}
