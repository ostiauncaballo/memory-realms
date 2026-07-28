import { Outlet } from 'react-router'
import { Footer } from '../components/Footer'
import { Header } from '../components/Header'

export function MainLayout() {
    return (
        <div className="app">
            <Header />

            <main className="app__main">
                <Outlet />
            </main>

            <Footer />
        </div>
    )
}