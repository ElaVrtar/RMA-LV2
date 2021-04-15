package com.example.inspiringpeople

object PeopleRepository {
    private val people = mutableListOf(
        InspiringPerson(
            "Larry Page", "26.03.1973.",
            "Lawrence Edward Page is an American computer scientist and Internet entrepreneur. He is best known as one of the co-founders of Google along with Sergey Brin." +
                    "Page was the chief executive officer of Google from 1997 until August 2001 (stepping down in favor of Eric Schmidt) then from April 2011 until July 2015 when he moved to become CEO of Alphabet Inc. ",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg/330px-Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
            listOf("My job as a leader is to make sure everybody in the company has great opportunities, and that they feel they're having a meaningful impact and are contributing to the good of society.",
                "Invention is not enough..",
                "If you're changing the world, you're working on important things.")),
        InspiringPerson("Alan Kay", "17.05.1940.",
            "Alan Curtis Kay is an American computer scientist. He has been elected a Fellow of the American Academy of Arts and Sciences, the National Academy of Engineering, and the Royal Society of Arts."+"He is best known for his pioneering work on object-oriented programming and windowing graphical user interface (GUI) design. ",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Alan_Kay_%283097597186%29_%28cropped%29.jpg/330px-Alan_Kay_%283097597186%29_%28cropped%29.jpg",
            listOf("The best way to predict the future is to invent it",
                "A change in perspective is worth 80 IQ points",
                "The most disastrous thing that you can ever learn is your first programming language."))
    )

    fun getPeopleInstance(): MutableList<InspiringPerson> = people

    fun addPerson(inspiringPerson: InspiringPerson)
    {
        people.add(inspiringPerson)
    }
}