import './App.css'
import { Footer } from './components/Footer'
import { Header } from './components/Header'
import { Hero } from './components/Hero'
import { MemoryReel } from './components/MemoryReel'

function App() {
    return (
        <div className="app">
            <Header />

            <main className="app__main">
                <Hero />
                <MemoryReel />
            </main>

            <Footer />
        </div>
    )
}

export default App