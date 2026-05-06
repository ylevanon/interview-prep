# Flock Freight Interview Prep

Focused prep for a Senior Full Stack Product Engineering technical screen.

The recruiter guidance emphasizes:

- Object-oriented programming
- Data structures
- React
- TypeScript
- Communicating thought process clearly

The job description also mentions Java, Spring Boot, REST/gRPC, SQL, production support, Docker, CI/CD, and React/TypeScript.

## How To Use This Repo

1. Start with `mock-interviews/01-oop-shipment-tracking.md`.
2. Code the Java exercise in `java-oop/src/main/java/com/flockprep/shipping`.
3. Review the Spring Boot API shape in `spring-boot-shipping-api`.
4. Practice the React/TypeScript prompt in `react-typescript/shipment-list-prompt.md`.
5. Use `notes/talk-track.md` before the interview to rehearse how to communicate.

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

The main practice domain is shipment tracking because it maps well to Flock Freight:

- Shipments
- Tracking events
- Customers
- Latest status lookup
- Ownership checks
- REST API design
- React list/detail UI

This gives realistic practice without needing their actual codebase.

## Run The Plain Java Exercise

```bash
javac -d java-oop/out java-oop/src/main/java/com/flockprep/shipping/*.java
java -cp java-oop/out com.flockprep.shipping.Main
```

Expected output:

```text
Latest event: IN_TRANSIT in Yuma
Latest event count: 1
```
# interview-prep
