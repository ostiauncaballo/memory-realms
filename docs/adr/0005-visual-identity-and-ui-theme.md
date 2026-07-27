# ADR-005: Visual Identity and UI Theme

## Status

Accepted

## Date

23/07/2026

## Context

Memory Realms is a platform for preserving and sharing memorable experiences from fantasy and science-fiction games.

The application may contain content from visually different sources, including video games, tabletop games, role-playing sessions, miniature photography and AI-generated artwork.

Because the content itself may contain many different colors and visual styles, the surrounding user interface must provide a consistent and restrained visual identity.

The interface should feel elegant, immersive and modern without appearing childish or relying excessively on traditional fantasy or elven visual conventions.

## Decision

Memory Realms will use a dark visual theme.

The primary color palette will be:

- Primary background: Incubi Darkness (`#0e2728`)
- Secondary accent: Wazdakka red (`#661214`)
- Highlight accent: Nazdreg yellow (`#ffda00`)

The dark blue-green color will be used for the main navigation areas, containers and interface backgrounds.

The dark red color will be used selectively for secondary actions, important controls and visual emphasis.

The muted gold color will be reserved for highlights, active navigation elements, icons and small decorative details.

The interface will use:

- Rounded borders for cards, buttons and containers
- Subtle shadows and overlays
- Moderate spacing between components
- Clear visual hierarchy
- Elegant and highly readable typography
- Neutral iconography without childish or excessively ornamental fantasy elements

The visual language may take inspiration from familiar component systems such as Bootstrap, particularly in its use of rounded controls, predictable spacing and clearly differentiated interactive elements.

The exact typefaces may be selected during implementation, provided they remain elegant, readable and appropriate for a modern community platform.

## Consequences

- The interface will remain visually consistent despite displaying content from many different games and sources.
- Dark interface elements will allow colorful images and stories to remain the primary focus.
- The selected palette will give Memory Realms a recognizable identity.
- Accent colors must be used sparingly to avoid competing with the background collage and story content.
- Accessibility and color contrast must be considered when implementing text, controls and interactive states.