import { NavLink } from 'react-router'
import './Header.css'

export function Header() {
    return (
        <header className="header">
            <NavLink className="brand" to="/">
                <span className="brand__icon">◇</span>
                <span>Memory Realms</span>
            </NavLink>

            <nav className="navigation" aria-label="Main navigation">
                <NavLink
                    className={({ isActive }) =>
                        `navigation__link${isActive ? ' navigation__link--active' : ''}`
                    }
                    to="/"
                    end
                >
                    Home
                </NavLink>

                <NavLink
                    className={({ isActive }) =>
                        `navigation__link${isActive ? ' navigation__link--active' : ''}`
                    }
                    to="/stories"
                >
                    Stories
                </NavLink>

                <NavLink
                    className={({ isActive }) =>
                        `navigation__link${isActive ? ' navigation__link--active' : ''}`
                    }
                    to="/collections"
                >
                    Collections
                </NavLink>

                <NavLink
                    className={({ isActive }) =>
                        `navigation__link${isActive ? ' navigation__link--active' : ''}`
                    }
                    to="/tags"
                >
                    Tags
                </NavLink>

                <NavLink
                    className={({ isActive }) =>
                        `navigation__link${isActive ? ' navigation__link--active' : ''}`
                    }
                    to="/about"
                >
                    About
                </NavLink>
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