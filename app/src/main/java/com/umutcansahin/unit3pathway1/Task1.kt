package com.umutcansahin.unit3pathway1

enum class Daypart{
    MORNING, AFTERNOON, EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {

    val event = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        Daypart.EVENING,
        15
    )

    println(event)

    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1,event2,event3,event4,event5,event6)

    println("--------------------------------------------------------event süresi 60'dan kücük olanlar")
    val shortEvents = events.filter {
        it.durationInMinutes < 60
    }
    println("You have ${shortEvents.size} short events.")


    println("--------------------------------------------------------eventleri 'daypart' göre gruplama ")
    val groupedEvents = events.groupBy {
        it.daypart
    }
    groupedEvents.forEach{ (daypart, events) ->
        println("${daypart}: ${events.size} events")
    }

    println("--------------------------------------------------------günün son event'i ")
    println("Last event of the day: ${events.last().title}")

}

