import './Header.css';

export function Header() {
  return (
      <header className="header">
        <a className="brand" href="#" aria-label="Memory Realms home">
          <span className="brand__icon">◇</span>
          <span>Memory Realms</span>
        </a>

        <nav className="navigation" aria-label="Main navigation">
          <a className="navigation__link navigation__link--active" href="#">
            Home
          </a>
          <a className="navigation__link" href="#">
            Stories
          </a>
          <a className="navigation__link" href="#">
            Collections
          </a>
          <a className="navigation__link" href="#">
            About
          </a>
        </nav>

        <div className="header__actions">
          <input
              className="search"
              type="search"
              aria-label="Search stories"
              placeholder="Search stories..."
          />
        </div>
      </header>
  )
}