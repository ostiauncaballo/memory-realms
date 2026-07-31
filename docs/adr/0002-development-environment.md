# ADR-002: Development Environment

## Status

Accepted

## Date

17/07/2026

## Context

Every project should start from a common development environment.

This ADR defines the minimum development environment required for any project maintained by the team. Additional tools are welcome, but this baseline is assumed by default.

The objective is to minimise onboarding time and ensure every developer has the same basic tooling available.

## Decision

### Runtime

- Java 25
- Node.js (LTS)
- Docker

### Applications

- IntelliJ IDEA
- Docker Desktop *(optional)*

### IntelliJ Plugins

- Maven
  - Wrapper or plugin
- Git
- Docker
- Markdown
- Windsurf

### Essential Keyboard Shortcuts

| Action              | Shortcut           |
|---------------------|--------------------|
| Go to File          | `Ctrl + Shift + R` |
| Find in File        | `Ctrl + H`         |
| Next Occurrence     | `Ctrl + K`         |
| Find Usages         | `Alt + Shift + G`  |
| Select Next Tab     | `Ctrl + AvPag`     |
| Select Previous Tab | `Ctrl + RePag`     |
| Close Tab           | `Ctrl + W`         |
| Comment line        | `Ctrl + Shift + C` |

## Consequences

- Every developer starts from the same baseline.
- Project documentation can assume these tools are available.
- New team members can be productive with minimal setup.
- Individual developers may install additional tools, but this baseline should always be available.