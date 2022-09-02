class Hawk: Animal, Oviparous {
    override fun move(): String {
        return "Fly"
    }

    override fun isOviparous(): String {
        return "lay eggs"
    }
}