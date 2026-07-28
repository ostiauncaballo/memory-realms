import { Hero } from '../components/Hero'
import { MemoryReel } from '../components/MemoryReel'
import { sampleMemories } from '../data/sampleMemories'

export function HomePage() {
    return (
        <>
            <Hero />
            <MemoryReel memories={sampleMemories} />
        </>
    )
}