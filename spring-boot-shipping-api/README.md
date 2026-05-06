# Spring Boot Shipping API Practice

This is a small Spring Boot-style API skeleton for the shipment tracking interview problem.

## Endpoint To Explain

`GET /api/customers/{customerId}/shipments/{shipmentId}/latest-status`

In a real production API, the customer ID should usually come from authentication claims, not a path parameter. The path parameter is used here to keep the practice problem simple.

## Layer Responsibilities

- `ShipmentController`: HTTP route, path variables, response mapping
- `ShipmentTrackingService`: authorization check and latest-event business logic
- `ShipmentRepository`: lookup shipment data
- `ShipmentStatusResponse`: API response DTO

## How To Run Later

After installing Maven or opening in IntelliJ:

```bash
mvn spring-boot:run
```

Java 17 is the target version because Spring Boot 3 requires Java 17 or newer.
