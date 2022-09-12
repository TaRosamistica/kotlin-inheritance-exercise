class Hawk: Animal, Oviparous {
    override fun move(): String {
        return "fly"
    }

    override fun isOviparous(): String {
        return "lay eggs"
    }
}