# Senior Engineer Interview Prep

Focused prep for a Senior Full Stack Product Engineering technical screen.

The recruiter guidance emphasizes:

- Object-oriented programming
- Data structures
- React
- TypeScript
- Communicating thought process clearly

The job description also mentions Java, Spring Boot, REST/gRPC, SQL, production support, Docker, CI/CD, and React/TypeScript.

## How To Use This Repo

1. Start with `notes/talk-track.md`.
2. Open an exercise under `exercises/`.
3. Read that exercise's `README.md` prompt.
4. Implement the code in `starter/` without looking at `solution/`.
5. Compare against `solution/` and rehearse the explanation out loud.

## Tooling

IntelliJ IDEA is recommended for Java/Spring Boot. The Community edition is fine for Java basics, but Ultimate has stronger Spring Boot support.

You do not strictly need IntelliJ. Alternatives:

- VS Code with the Java extension pack and Spring Boot extensions
- Terminal plus Maven/Gradle
- Online editors for simple Java/OOP practice

Current machine status:

- Java is installed.
- Node/npm are installed.
- Maven and Gradle were not found on the PATH.

## What We Are Coding

The main practice domain is shipment tracking because it maps well to product-engineering interviews:

- Shipments
- Tracking events
- Customers
- Latest status lookup
- Ownership checks
- REST API design
- React list/detail UI

This gives realistic practice without needing their actual codebase.

## Exercises

- `exercises/01-java-oop-shipment-tracking`: OOP design and Java classes
- `exercises/02-data-structures-latest-event`: hash map latest-event problem
- `exercises/03-spring-boot-shipment-api`: controller/service/repository API shape
- `exercises/04-react-typescript-shipment-list`: React + TypeScript component prompt

## Compile A Plain Java Starter

```bash
javac -d exercises/01-java-oop-shipment-tracking/starter/out exercises/01-java-oop-shipment-tracking/starter/src/main/java/com/interviewprep/shipping/*.java
```

The starter may fail at runtime until you complete the TODOs. To run the reference solution:

```bash
javac -d exercises/01-java-oop-shipment-tracking/solution/out exercises/01-java-oop-shipment-tracking/solution/src/main/java/com/interviewprep/shipping/*.java
java -cp exercises/01-java-oop-shipment-tracking/solution/out com.interviewprep.shipping.Main
```

Expected solution output:

```text
Latest event: IN_TRANSIT in Yuma
Latest event count: 1
```
