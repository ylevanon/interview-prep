# Mock Interview 1: OOP Shipment Tracking

## Prompt

You are building a small shipment tracking feature for a logistics platform.

A shipment has:

- `id`
- `customerId`
- `origin`
- `destination`
- `status`
- a list of tracking events

A tracking event has:

- `shipmentId`
- `timestamp`
- `location`
- `description`
- `status`

The product needs an API that lets a customer view the latest status of one of their shipments.

## What To Talk Through

- What classes/models you would define
- What controller endpoint you would expose
- What service logic would do
- How you would prevent one customer from accessing another customer's shipment
- Edge cases
- Time complexity for finding the latest event

## Strong Answer Outline

- Define `Shipment`, `TrackingEvent`, and `ShipmentStatus`.
- Keep business logic in `ShipmentTrackingService`.
- Keep persistence access behind repository interfaces.
- Expose `GET /api/customers/{customerId}/shipments/{shipmentId}/status` or derive customer identity from auth instead of trusting the path.
- Check that the shipment exists.
- Check that the shipment belongs to the requesting customer.
- Return 404 for missing shipment and 403 for unauthorized access.
- Find latest event by timestamp using a linear scan: O(n) for n events.
- In a real database, query latest event with `ORDER BY timestamp DESC LIMIT 1`.

## Follow-Up Questions

- Would you store events embedded inside the shipment or in a separate table?
- How would you handle two events with the same timestamp?
- How would you design this if tracking events arrive asynchronously?
- What would you log or monitor in production?
