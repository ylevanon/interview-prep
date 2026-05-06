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
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    let isMounted = true;

    async function loadShipments() {
      try {
        const response = await fetch("/api/shipments");
        if (!response.ok) {
          throw new Error("Failed to load shipments");
        }

        const data = (await response.json()) as Shipment[];
        if (isMounted) {
          setShipments(data);
        }
      } catch (err) {
        if (isMounted) {
          setError(err instanceof Error ? err.message : "Unknown error");
        }
      } finally {
        if (isMounted) {
          setIsLoading(false);
        }
      }
    }

    loadShipments();

    return () => {
      isMounted = false;
    };
  }, []);

  const filteredShipments = statusFilter === "ALL"
    ? shipments
    : shipments.filter((shipment) => shipment.status === statusFilter);

  return (
    <section>
      <h1>Shipments</h1>

      <label>
        Status
        <select value={statusFilter} onChange={(event) => setStatusFilter(event.target.value as ShipmentStatus | "ALL")}>
          <option value="ALL">All</option>
          <option value="CREATED">Created</option>
          <option value="IN_TRANSIT">In transit</option>
          <option value="DELIVERED">Delivered</option>
          <option value="CANCELLED">Cancelled</option>
        </select>
      </label>

      {isLoading && <p>Loading shipments...</p>}
      {error && <p role="alert">{error}</p>}
      {!isLoading && !error && filteredShipments.length === 0 && <p>No shipments found.</p>}
      {!isLoading && !error && filteredShipments.length > 0 && (
        <ul>
          {filteredShipments.map((shipment) => (
            <li key={shipment.id}>
              {shipment.origin} to {shipment.destination}: {shipment.status}
            </li>
          ))}
        </ul>
      )}
    </section>
  );
}
