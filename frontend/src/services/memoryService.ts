import type { Memory } from '../domain/Memory'

export async function getMemories(): Promise<Memory[]> {
    const response = await fetch('http://localhost:8080/api/memories')

    if (!response.ok) {
        throw new Error(`Failed to fetch memories: ${response.status} ${response.statusText}`)
    }

    return await response.json() as Promise<Memory[]>
}
