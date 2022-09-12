class Dog: Mammal {
    override fun isMammal(): String {
        return "its a mammal"
    }

    override fun move(): String {
        return "walk"
    }
}