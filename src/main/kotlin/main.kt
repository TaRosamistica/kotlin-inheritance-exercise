fun main (){

    val einstein = Einstein()
    println("Einsten ${einstein.isMammal()}, ${einstein.move()} and ${einstein.alive()}")

    val platypus = Platypus()
    println("The platypus ${platypus.isMammal()},${platypus.isOviparous()}, ${platypus.move()}")

    val bat = Bat()
    println("The bat ${bat.isMammal()} and ${bat.move()}")

    val bird = Bird()
    println("The bird ${bird.isOviparous()} and ${bird.move()}")

    val dog = Dog()
    println("The dog ${dog.isMammal()} and ${dog.move()}")

    val hawk = Hawk()
    println("The hawk ${hawk.isOviparous()} and ${hawk.move()}")

    val penguim = Penguim()
    println("The penguim ${penguim.isOviparous()}, ${penguim.move()}")

    val snake = Snake()
    println("The snake ${snake.isOviparous()} and ${snake.move()}")

    val whale = Whale()
    println("The whale ${whale.isMammal()} and ${whale.move()}")

}