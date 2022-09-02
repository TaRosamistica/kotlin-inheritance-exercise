class Dog: Mammal {
    override fun isMammal(): String {
        return "Its a mammal"
    }

    override fun move(): String {
        return "Walk"
    }
}