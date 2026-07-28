import { Link } from 'react-router'

export function NotFoundPage() {
    return (
        <section className="placeholder-page">
            <p className="placeholder-page__code">404</p>
            <h1>Realm not found</h1>
            <p>The story you are looking for does not exist in this realm.</p>

            <Link className="placeholder-page__link" to="/">
                Return home
            </Link>
        </section>
    )
}