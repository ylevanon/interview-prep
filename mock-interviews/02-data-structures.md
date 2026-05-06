# Mock Interview 2: Data Structures

## Prompt

Given a list of tracking events, return the latest event for each shipment ID.

Each event has:

- `shipmentId`
- `timestamp`
- `location`
- `status`

## Expected Approach

Use a hash map from `shipmentId` to the latest event seen so far.

For each event:

- If the shipment ID is not in the map, add it.
- If it is already in the map, compare timestamps.
- Replace the stored event only if the new event is later.

## Complexity

- Time: O(n)
- Space: O(k), where k is the number of unique shipment IDs

## Edge Cases

- Empty input
- Null input if Java method allows it
- Duplicate timestamps
- Multiple events for the same shipment
- Events arriving out of order
