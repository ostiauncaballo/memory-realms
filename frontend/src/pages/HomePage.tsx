import { useState, useEffect } from 'react'
import { Hero } from '../components/Hero'
import { MemoryReel } from '../components/MemoryReel'
import { getMemories } from '../services/memoryService'
import type { Memory } from '../domain/Memory'

export function HomePage() {
    const [memories, setMemories] = useState<Memory[]>([])
    const [isLoading, setIsLoading] = useState(true)
    const [error, setError] = useState<string | null>(null)

    useEffect(() => {
        async function loadMemories() {
            try {
                const data = await getMemories()
                setMemories(data)
            } catch (err) {
                setError(err instanceof Error ? err.message : 'Failed to load memories')
            } finally {
                setIsLoading(false)
            }
        }

        loadMemories()
    }, [])

    return (
        <>
            <Hero />
            {isLoading && <p>Loading memories...</p>}
            {error && <p>Error: {error}</p>}
            {!isLoading && !error && <MemoryReel memories={memories} />}
        </>
    )
}