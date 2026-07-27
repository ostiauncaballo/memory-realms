import './Hero.css'

export function Hero() {
    return (
        <section className="hero">
            <div className="hero__content">
                <p className="hero__eyebrow">
                    Stories worth remembering
                </p>

                <h1 className="hero__title">
                    Your adventures. Forever.
                </h1>

                <div
                    className="hero__separator"
                    aria-hidden="true"
                >
                    <span className="hero__separator-line" />
                    <span className="hero__separator-symbol">◆</span>
                    <span className="hero__separator-line" />
                </div>

                <p className="hero__description">
                    Capture the moments that matter and keep your stories alive.
                </p>
            </div>
        </section>
    )
}