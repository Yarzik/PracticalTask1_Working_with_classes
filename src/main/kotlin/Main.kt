fun main() {

    val appDB = AppDB()

    val repository = AnimalsPespository(appDB)
    for (i in 0..3){
        val animal = repository.findById (i)
        if (animal != null) {
            print(animal.name)
            println(" is it a predator? y/n")
            val pred = readln()
            if (pred == "y"){
                val predators = Predators(i, animal.name, animal.weight, true)
                val list = mutableListOf<Animals>()
                list.add(predators)
                println(animal.name+ " is a predator")
            }
            else {
                val herbivore = Herbivore(i, animal.name, animal.weight, true)
                val list = mutableListOf<Animals>()
                list.add(herbivore)
                println(animal.name+ " is not a predator")
            }


        }
    }
    println(repository.getAll())
}