export type SampleMemory = {
  id: number
  title: string
  universe: string
  description: string
  image: string
  comments: number
  likes: number
  rating: number
}

export const sampleMemories: SampleMemory[] = [
  {
    id: 1,
    title: 'The Lost Temple of Chotec',
    universe: 'Role-playing',
    description: 'Our party faced ancient traps and forgotten guardians.',
    image: '/images/lost-temple.jpg',
    comments: 12,
    likes: 28,
    rating: 4.8,
  },
  {
    id: 2,
    title: 'Icecrown Citadel Raid Night',
    universe: 'World of Warcraft',
    description: 'An unforgettable night with the guild.',
    image: '/images/icecrown.jpg',
    comments: 7,
    likes: 15,
    rating: 4.6,
  },
]