import './Hero.css'

export function Hero() {
    return (
        <section className="hero">
            <div className="hero__content">
                <p className="hero__eyebrow">Stories worth remembering</p>

                <h1 className="hero__title">Your adventures. Forever.</h1>

                <p className="hero__description">
                    Preserve the moments that stayed with you after the game was over.
                </p>
            </div>
        </section>
    )
}