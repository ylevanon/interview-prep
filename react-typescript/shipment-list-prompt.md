# React + TypeScript Prompt: Shipment List

## Prompt

Build or describe a `ShipmentList` component that fetches shipments from an API and renders them.

Requirements:

- Fetch shipments from `/api/shipments`.
- Show loading, error, and empty states.
- Render shipment origin, destination, and status.
- Add a status filter.
- Use TypeScript types for the API response.

## Types

```ts
type ShipmentStatus = "CREATED" | "IN_TRANSIT" | "DELIVERED" | "CANCELLED";

interface Shipment {
  id: string;
  origin: string;
  destination: string;
  status: ShipmentStatus;
}
```

## Interview Points

- Explain state: `shipments`, `statusFilter`, `isLoading`, `error`.
- Explain `useEffect` for fetching on mount.
- Explain controlled select input for filtering.
- Explain stable `key={shipment.id}`.
- Explain why TypeScript helps catch invalid statuses and malformed API use.
