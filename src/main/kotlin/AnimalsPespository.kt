class AnimalsPespository constructor(private val AppDB: AppDB) {

    fun getAll(): MutableList<Animals> {
        return AppDB.list
    }

    fun findById(id: Int): Animals? {
        return AppDB.list.find { it.id == id }
    }

    fun insert(Animals: Animals): Unit {
        AppDB.list.add(Animals)
    }

    fun delete(Animals: Animals) {
        AppDB.list.remove(Animals)
    }

    fun update(Animals: Animals) {
        val Animals1 = findById(Animals.id)
        if (Animals1 != null) {
            val index = AppDB.list.indexOf(Animals1)
            AppDB.list[index] = Animals
        }

    }
}