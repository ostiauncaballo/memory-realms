import { Link } from 'react-router'
import './Footer.css'

export function Footer() {
    return (
        <footer className="footer">
            <div className="footer__brand">
                <Link className="footer__title" to="/">
                    Memory Realms
                </Link>

                <p className="footer__tagline">Your adventures. Forever.</p>
            </div>

            <nav className="footer__navigation" aria-label="Footer navigation">
                <Link to="/stories">Stories</Link>
                <Link to="/collections">Collections</Link>
                <Link to="/tags">Tags</Link>
                <Link to="/about">About</Link>

                <a
                    href="https://github.com/ostiauncaballo"
                    target="_blank"
                    rel="noreferrer"
                >
                    GitHub
                </a>
            </nav>

            <p className="footer__copyright">
                © 2026 Memory Realms
            </p>
        </footer>
    )
}