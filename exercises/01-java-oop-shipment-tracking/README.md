# Exercise 01: Java OOP Shipment Tracking

## Prompt

Design a small shipment tracking model in Java.

A shipment has:

- `id`
- `customerId`
- `origin`
- `destination`
- `status`
- tracking events

A tracking event has:

- `shipmentId`
- `timestamp`
- `location`
- `description`
- `status`

Implement service logic that returns the latest tracking event for a shipment, but only if the requesting customer owns that shipment.

## Requirements

- Model `Shipment`, `TrackingEvent`, and `ShipmentStatus`.
- Keep shipment events encapsulated.
- Reject tracking events whose `shipmentId` does not match the shipment.
- In `ShipmentTrackingService`, implement `latestEventForCustomer`.
- Return `Optional.empty()` if the shipment has no events.
- Throw an exception if the customer does not own the shipment.

## What To Explain Out Loud

- Why `ShipmentStatus` is an enum.
- Why the service performs the ownership check.
- Why returning an unmodifiable event list protects encapsulation.
- Time complexity of scanning events for latest timestamp: O(n).

## Practice Flow

1. Implement `starter/` first.
2. Compile and run it.
3. Compare with `solution/`.
