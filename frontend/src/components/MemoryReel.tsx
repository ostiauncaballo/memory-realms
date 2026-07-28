import type { Memory } from '../domain/Memory'
import { MemoryCard } from './MemoryCard'
import './MemoryReel.css'

type MemoryReelProps = {
    memories: Memory[]
}

export function MemoryReel({ memories }: MemoryReelProps) {
    return (
        <section className="memory-reel">
            <div className="memory-reel__header">
                <h2 className="memory-reel__title">Latest stories</h2>
            </div>

            <div className="memory-reel__list">
                {memories.map((memory) => (
                    <MemoryCard
                        key={memory.id}
                        memory={memory}
                    />
                ))}
            </div>
        </section>
    )
}