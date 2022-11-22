package com.umutcansahin.unit3pathway1

fun main() {
    learnArrays()
    learnLists()
    learnMutableLists()
    learnMutableSets()
    learnMutableMaps()
}

fun learnArrays () {
    println("-------------------------------------------------------------arrayOf")
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    println("---")
    println(solarSystem[3])
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    println("---")
    //solarSystem[8] = "Pluto"
    // dizi sabit olduğu icin ekleme yapilamaz , bir dizi icerisine ek bir ilave yapmak istiyorsak enbastan bir dizi olusturmamız gerekir

    println("---")
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}

fun learnLists() {
    println("-------------------------------------------------------------listOf")
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    println("---")
    for (planet in solarSystem) {
        println(planet)
    }
}

fun learnMutableLists(){
    println("-------------------------------------------------------------mutableListOf")
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3] = "Future Moon"

    println("---")
    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")

    println("---")
    println(solarSystem.contains("Pluto"))

    println("Future Moon" in solarSystem)
}

fun learnMutableSets() {
    println("-------------------------------------------------------------mutableSetOf")
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println("---")
    solarSystem.add("Pluto")
    println(solarSystem.size)  // mutableSetOf'larda yineleme olmaz.
    println("---")
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))

}

fun learnMutableMaps() {
    println("-------------------------------------------------------------mutableMapOf")

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem["Theia"])  //dizi icinde olmayan eleman "null" döner
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println("---")
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}