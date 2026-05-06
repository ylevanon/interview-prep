# Exercise 03: Spring Boot Shipment API

## Prompt

Design a REST endpoint for retrieving the latest shipment status for a customer.

Endpoint shape:

```text
GET /api/customers/{customerId}/shipments/{shipmentId}/latest-status
```

## Requirements

- Controller accepts path variables.
- Service loads the shipment and performs the ownership check.
- Repository abstracts data access.
- Response DTO returns status, location, description, and timestamp.
- Missing shipment maps to 404.
- Wrong customer maps to 403.

## Interview Note

In a production system, customer identity should usually come from authentication claims instead of trusting a path parameter. This exercise keeps it simple.
