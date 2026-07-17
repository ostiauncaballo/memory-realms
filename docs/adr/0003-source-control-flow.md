# ADR-003 - Source Control Workflow

## Status

Accepted

## Date

17/07/2026

## Context

Memory Realms is developed by a single developer.

Although the project is intentionally small, one of its primary goals is to maintain professional software engineering practices that resemble those used in a collaborative environment.

Using a structured Git workflow also helps preparing for future professional work.

## Decision

The project will use a simplified Git workflow.

The repository will contain a permanent `main` branch.

The `main` branch must always remain deployable.

Every GitHub Issue will be implemented in its own feature branch.

Branches will follow the naming convention:

feature/MR-001
feature/MR-002
feature/MR-003

Each feature branch will be merged through a Pull Request, even if developed by the project owner.

The Pull Request will act as a lightweight code review and historical record of the architectural decisions taken during implementation.

Merging strategy:
- Squash merge 

## Consequences

### Positive

- Clean Git history.
- Easy rollback.
- Professional workflow.
- Better preparation for future team environments.
- Every feature remains isolated until completed.

### Negative

- More commits and Pull Requests than strictly necessary for a solo project.
- Slightly slower development.

These disadvantages are accepted because the educational value outweighs the additional effort.