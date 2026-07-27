import './Footer.css'

export function Footer() {
  return (
      <footer className="footer">
        <div className="footer__brand">
          <strong className="footer__title">Memory Realms</strong>

          <p className="footer__tagline">Your adventures. Forever.</p>
        </div>

        <nav className="footer__navigation" aria-label="Footer navigation">
          <a href="#">Stories</a>
          <a href="#">Collections</a>
          <a href="#">About</a>
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