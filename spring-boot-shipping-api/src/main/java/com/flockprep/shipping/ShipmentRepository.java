package com.flockprep.shipping;

import java.util.Optional;

public interface ShipmentRepository {
    Optional<Shipment> findById(String shipmentId);
}
