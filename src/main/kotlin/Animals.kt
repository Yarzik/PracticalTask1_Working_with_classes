open class Animals (val id: Int, var name: String, var weight: Double) {

    override fun toString(): String {
        return "\n'$name', $weight kg"

    }
}