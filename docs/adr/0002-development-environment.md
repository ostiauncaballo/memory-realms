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
- Git
- Docker
- Markdown
- Windsurf

### Essential Keyboard Shortcuts

| Action | Shortcut |
|---------|----------|
| Go to File | `Ctrl + Shift + N` |
| Find in File | `Ctrl + F` |
| Next Occurrence | `F3` |
| Find Usages | `Alt + F7` |
| Select Next Tab | `Alt + Right` |
| Select Previous Tab | `Alt + Left` |
| Close Tab | `Ctrl + F4` |

## Consequences

- Every developer starts from the same baseline.
- Project documentation can assume these tools are available.
- New team members can be productive with minimal setup.
- Individual developers may install additional tools, but this baseline should always be available.