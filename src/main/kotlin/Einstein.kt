class Einstein: Human {
    fun alive(): String{
        return "not alive"
    }

    override fun move(): String {
        return "Walk"
    }

    override fun isMammal(): String {
        return "Its a mammal"
    }
}