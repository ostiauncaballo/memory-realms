import { Route, Routes } from 'react-router'
import { MainLayout } from './layouts/MainLayout'
import { AboutPage } from './pages/AboutPage'
import { CollectionsPage } from './pages/CollectionsPage'
import { HomePage } from './pages/HomePage'
import { NotFoundPage } from './pages/NotFoundPage'
import { StoriesPage } from './pages/StoriesPage'
import { TagsPage } from './pages/TagsPage'
import './App.css'
import './pages/pages.css'

function App() {
    return (
        <Routes>
            <Route element={<MainLayout />}>
                <Route index element={<HomePage />} />
                <Route path="stories" element={<StoriesPage />} />
                <Route path="collections" element={<CollectionsPage />} />
                <Route path="tags" element={<TagsPage />} />
                <Route path="about" element={<AboutPage />} />
                <Route path="*" element={<NotFoundPage />} />
            </Route>
        </Routes>
    )
}

export default App