# ADR-007: Homepage Information Architecture

## Status

Accepted

## Date

23/07/2026

## Context

The Memory Realms homepage is the main entry point to the platform.

It must allow visitors to understand the purpose of the application, navigate between its main areas and discover stored memories without requiring multiple initial interactions.

The first version should feel like a real community platform while remaining compatible with the intentionally limited scope of the MVP.

Future functionality may include comments, ratings, reactions and content submission, but those capabilities are not required for the initial landing page.

## Decision

The homepage will use a three-part vertical structure:

1. Header
2. Main story reel
3. Footer

### Header

A persistent header will be displayed at the top of the page.

It will contain:

- Memory Realms branding
- Primary navigation
- Access to the main content sections
- Space for future actions such as search, user access or content submission

The initial navigation may include:

- Home
- Stories
- Collections
- Tags
- About

Items without implemented functionality may be displayed as non-functional placeholders or postponed until client-side routing is introduced.

### Main content

The main area of the viewport will be occupied by a horizontal reel of stored memories.

Each visible story card may contain:

- Cover image
- Story title
- Game, universe or category
- Short summary
- Optional metadata
- Space for future comments, ratings or reactions

The reel will be the primary visual and interactive element of the homepage.

The first implementation may use static placeholder content. Integration with backend data will be introduced in a later issue.

A short introductory message or hero statement may appear above the reel, provided it does not displace the stories as the main focus of the page.

### Footer

The footer will contain secondary information such as:

- Project description
- Navigation links
- Repository link
- Legal or copyright information
- Technology or authorship references where appropriate

The footer will use the same dark visual language as the header.

### Responsive behaviour

The homepage must adapt to different viewport sizes.

On smaller screens:

- Navigation may collapse into a compact menu
- The story reel may display fewer cards
- Horizontal scrolling may be used
- Secondary information may be rearranged vertically

## Consequences

- Visitors will immediately see the principal content of Memory Realms.
- Navigation and secondary information will have predictable locations.
- The central reel provides a structure that can later support backend content, filtering and interactions.
- Some header controls and social interactions may initially be visual placeholders.
- The reel will require careful responsive behaviour and keyboard accessibility.
- Future pages can reuse the header, footer, card and layout components introduced by the homepage.