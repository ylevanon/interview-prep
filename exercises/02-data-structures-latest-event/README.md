# Exercise 02: Latest Event By Shipment ID

## Prompt

Given a list of tracking events, return the latest event for each shipment ID.

Events can arrive out of order.

## Requirements

- Implement `latestEventByShipmentId`.
- Use a hash map from `shipmentId` to latest event.
- Keep the event with the latest timestamp.
- Return an empty map for an empty list.

## Complexity Target

- Time: O(n)
- Space: O(k), where k is the number of unique shipment IDs

## Edge Cases

- Empty input
- Duplicate shipment IDs
- Events out of timestamp order
- Equal timestamps
