import type { SampleMemory } from '../data/sampleMemories'
import './MemoryCard.css'

type MemoryCardProps = {
  memory: SampleMemory
}

export function MemoryCard({ memory }: MemoryCardProps) {
  return (
      <article className="memory-card">
        <img
            className="memory-card__image"
            src={memory.image}
            alt=""
        />

        <div className="memory-card__content">
          <p className="memory-card__universe">
            {memory.universe}
          </p>

          <h3 className="memory-card__title">
            {memory.title}
          </h3>

          <p className="memory-card__description">
            {memory.description}
          </p>

          <div className="memory-card__metadata">
          <span aria-label={`${memory.comments} comments`}>
            {memory.comments} comments
          </span>

            <span aria-label={`${memory.likes} likes`}>
            {memory.likes} likes
          </span>

            <span aria-label={`Rating ${memory.rating} out of 5`}>
            ★ {memory.rating}
          </span>
          </div>
        </div>
      </article>
  )
}