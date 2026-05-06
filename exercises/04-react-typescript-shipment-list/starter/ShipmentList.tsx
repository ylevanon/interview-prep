import { useEffect, useState } from "react";

type ShipmentStatus = "CREATED" | "IN_TRANSIT" | "DELIVERED" | "CANCELLED";

interface Shipment {
  id: string;
  origin: string;
  destination: string;
  status: ShipmentStatus;
}

export function ShipmentList() {
  const [shipments, setShipments] = useState<Shipment[]>([]);
  const [statusFilter, setStatusFilter] = useState<ShipmentStatus | "ALL">("ALL");
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    // TODO: fetch /api/shipments, set loading/error state, and store shipments.
  }, []);

  // TODO: derive filteredShipments from shipments and statusFilter.

  return (
    <section>
      <h1>Shipments</h1>

      {/* TODO: render a controlled select for statusFilter. */}
      {/* TODO: render loading, error, empty, and success states. */}
    </section>
  );
}
