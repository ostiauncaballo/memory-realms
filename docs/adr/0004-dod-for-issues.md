# ADR-004: Definition of Done

## Status

Accepted

## Date

23/07/2026

## Context

The project needs a consistent definition of when a GitHub Issue can be considered complete.

Acceptance Criteria describe the specific functional requirements of an individual issue.

The Definition of Done defines the common quality conditions that apply to every issue in the project.

Repeating the same Definition of Done checklist in every GitHub Issue would create unnecessary duplication and could lead to inconsistencies over time.

## Decision

The project will use a single, shared Definition of Done.

Every GitHub Issue must satisfy the following conditions before it can be considered complete:

* [ ] All Acceptance Criteria defined in the issue are satisfied.
* [ ] The implementation is complete.
* [ ] The project builds successfully.
* [ ] Existing tests pass.
* [ ] Tests have been added or updated when required.
* [ ] Documentation has been updated when required.
* [ ] No known blocking defects remain.
* [ ] The implementation has been merged into the `main` branch through a Pull Request.

GitHub Issues will contain their issue-specific Acceptance Criteria.

The shared Definition of Done will not be duplicated in every issue.

## Consequences

* GitHub Issues remain focused on their specific functional requirements.
* The distinction between Acceptance Criteria and Definition of Done is explicit.
* Quality requirements are consistent across the entire project.
* Changes to the Definition of Done only need to be made in one place.
* An issue cannot be considered complete until both its Acceptance Criteria and the shared Definition of Done are satisfied.
