import { sampleMemories } from '../data/sampleMemories'
import { MemoryCard } from './MemoryCard'
import './MemoryReel.css'

export function MemoryReel() {
    return (
        <section className="memory-reel">
            <div className="memory-reel__header">
                <h2 className="memory-reel__title">
                    Latest stories
                </h2>

                <a className="memory-reel__view-all" href="#">
                    View all
                </a>
            </div>

            <div className="memory-reel__list">
                {sampleMemories.map((memory) => (
                    <MemoryCard
                        key={memory.id}
                        memory={memory}
                    />
                ))}
            </div>
        </section>
    )
}