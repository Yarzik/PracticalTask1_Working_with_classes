class AppDB {
    val list = mutableListOf<Animals>()

    init {
        for (i in 0..3){
            print("Enter type:")
            var type = readln()
            print("Enter weight: ")
            var weight = readln().toDouble()
            val animals = Animals(id = i, name = type, weight = weight)
            list.add(animals)
        }
    }
}