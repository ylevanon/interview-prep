# Technical Interview Talk Track

Use this rhythm when answering technical prompts.

## Problem Solving Flow

1. Clarify input and output.
2. Confirm constraints and edge cases.
3. Start with a simple correct solution.
4. Explain data structures and tradeoffs.
5. Code cleanly.
6. Test with examples.
7. State time and space complexity.

## Useful Phrases

- "Let me clarify the expected input and output first."
- "I’ll start with the straightforward version, then optimize if needed."
- "A hash map is useful here because we need fast lookup by ID."
- "I’m separating controller, service, and repository concerns so the business logic stays testable."
- "I’d enforce customer ownership in the service layer, not just the frontend."
- "For production, I’d also think about logging, metrics, validation, and clear error responses."

## Spring Boot Answer Shape

For a REST endpoint, describe:

- Controller: request/response handling
- Service: business logic, authorization, orchestration
- Repository: persistence access
- DTOs: API contract separate from database entities
- Validation: request validation and missing/invalid input
- Error handling: 404, 403, 400, and 500 paths

## React Answer Shape

For a component, describe:

- Props and state
- Loading/error/empty states
- Data fetching with `useEffect` or framework loader
- Controlled inputs for filters/forms
- TypeScript types for API responses
- Rendering lists with stable keys
- Avoiding derived state when it can be computed during render
