# ADR-001: Define the Project Purpose and Scope

## Status

Accepted

## Date

16/07/2026

## Context

Memory Realms is a personal software project created during a professional reactivation period after working for approximately ten years as a Java Backend Engineer.

The project represents a fictional community platform where people can share memorable experiences from fantasy and science-fiction games. These experiences may come from video games, tabletop games, role-playing campaigns or other fictional universes, and may be represented through stories, images, audio or video.

Memory Realms is not intended to become a commercial product or an actively maintained community. Its primary purpose is to provide a realistic and enjoyable environment in which to:

* Refresh existing Java and Spring knowledge.
* Learn React from a backend engineer's perspective.
* Improve knowledge of Docker, CI/CD, hosting and deployment.
* Explore current AI-assisted development workflows.
* Demonstrate software engineering experience through a public project.
* Prepare for senior backend engineering interviews and future employment.

Without an explicit scope, the project could easily grow into a complete social platform requiring authentication, moderation, file storage, administration tools and production-grade persistence. That complexity would conflict with its actual professional and educational purpose.

## Decision

Memory Realms will be developed as a production-inspired MVP.

The project will use professional engineering practices where they provide technical, educational or portfolio value, while deliberately simplifying product functionality.

The initial solution will consist of:

* A React frontend.
* A Java and Spring Boot backend.
* A REST API exposing memory content.
* Sample content stored in JSON files within the application.
* A public GitHub repository.
* Automated build and test workflows.
* Containerized execution and deployment.
* Lightweight architectural documentation using Markdown ADRs.

The initial MVP may include:

* A landing page.
* A list of published memories.
* A detailed memory view.
* Filtering by universe or content type.
* Static stories, images and audio.
* A simulated submission form.

The following capabilities are explicitly outside the initial scope:

* User registration and authentication.
* Runtime content creation.
* Database persistence.
* Real file uploads.
* Comments and reactions.
* Content moderation.
* Administration interfaces.
* Notifications.
* Monetization.
* Native mobile applications.
* High availability or production-scale infrastructure.

Features outside this scope may only be introduced when they provide clear learning, portfolio or interview-preparation value.

## Consequences

### Positive

* The project can be completed incrementally without becoming a long-term obligation.
* Engineering practices can be demonstrated without building an entire social network.
* Static JSON content keeps infrastructure and deployment simple.
* React, Spring Boot, Docker and CI/CD can be practised in a realistic context.
* The project remains compatible with future extensions if a database or authentication is later considered useful.
* The theme provides a personally engaging setting that should make regular work easier to sustain.

### Negative

* Some visible functionality will be simulated rather than fully operational.
* Content modifications will initially require source-code changes and redeployment.
* The application will not support real community participation.
* The resulting architecture may be more sophisticated than the functional requirements strictly require.

These consequences are accepted because Memory Realms is primarily an engineering and professional-development project rather than a commercial product.
