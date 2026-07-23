# ADR-006: Homepage Background Treatment

## Status

Accepted

## Date

23/07/2026

## Context

The Memory Realms homepage should immediately communicate the diversity of experiences that can be preserved on the platform.

These experiences may include:

- Photographs of tabletop and role-playing sessions
- Photographs of painted miniatures
- Video game screenshots
- Fantasy and science-fiction landscapes
- AI-generated illustrations
- Artwork representing personal campaigns and stories

Using a single hero image would represent only one part of the platform and could make the application appear associated with a specific game or universe.

A collage can communicate a broader range of memories, but displaying many unrelated images at full intensity could make the interface visually noisy and reduce content readability.

## Decision

The homepage will use a collage of fantasy and science-fiction images as its principal background.

The collage may include images representing:

- Tabletop miniatures
- Role-playing sessions
- World of Warcraft
- Baldur's Gate
- Warhammer
- Star Wars
- Original fantasy worlds
- AI-generated Memory Realms artwork

The collage will be treated as atmospheric background content rather than as the main interactive content.

The following visual treatments will be applied:

- Dark overlay
- Reduced brightness
- Moderate blur
- Optional desaturation
- Soft transitions between images
- Sufficient contrast behind text and interactive components

The collage must not contain essential information or controls.

The central story reel, header and footer must remain readable independently of the specific images displayed behind them.

Only images that can legally be used in the project will be committed or deployed.

Temporary placeholders or generated artwork may be used during development.

## Consequences

- The homepage will immediately communicate the variety of experiences supported by Memory Realms.
- The application will have a distinctive and emotionally engaging appearance.
- The darkened and blurred treatment will prevent the collage from competing with the story reel.
- Image selection and optimization will require additional care.
- Large background assets may affect loading performance if they are not compressed appropriately.
- Copyright and licensing must be reviewed before publishing third-party screenshots or artwork.
- The background implementation must provide an acceptable fallback while images are loading or unavailable.