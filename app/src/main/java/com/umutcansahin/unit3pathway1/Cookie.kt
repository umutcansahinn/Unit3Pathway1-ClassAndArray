package com.umutcansahin.unit3pathway1

class Cookie (
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
    )

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    denemeForEach()
    denemeMap()
    denemeFilter()
    denemeGroupBy()
    denemeFold()
    denemeSortedBy()
}

fun denemeForEach(){
    println("----------------------------------------forEach")
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}

fun denemeMap(){
    println("----------------------------------------Map")
    val fullMenu = cookies.map {
        "${it.name} - ${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}

fun denemeFilter(){
    println("----------------------------------------Filter")
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}

fun denemeGroupBy() {
    println("----------------------------------------GroupBy")
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}

fun denemeFold() {
    println("----------------------------------------Fold")
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")
}

fun denemeSortedBy() {
    println("----------------------------------------SortedBy")
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}