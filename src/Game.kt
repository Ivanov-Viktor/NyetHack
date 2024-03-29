fun main(args: Array<String>) {
    val name = "Anastasia"
    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    /* Аура */
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (isBlessed) {
            "has some minor wound but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
         in 15..74 -> "Looks pretty hurt"
         else -> "is in awful condition"
    }
    /* Состояние перса */
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

}