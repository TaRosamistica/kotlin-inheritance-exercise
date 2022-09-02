class Playpus: Mammal, Oviparous {
    override fun isMammal(): String {
        return "Its a mammal"
    }

    override fun isOviparous(): String {
        return "lay eggs"
    }

    override fun move(): String {
        return "swim and walk"
    }
}