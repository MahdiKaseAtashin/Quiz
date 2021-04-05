package com.mahdikaseatashin.quiz

object Constants {

    fun getQuestions(): ArrayList<Questions> {

        val questions = ArrayList<Questions>()
        var q = Questions(
            1,
            "What company this logo belongs to?",
            R.drawable.beats,
            "Beats",
            "Big Red Button",
            "Best Players",
            "Bob Marley",
            1
        )
        questions.add(q)

        q = Questions(
            2,
            "What company this logo belongs to?",
            R.drawable.burgerking,
            "Beats",
            "Burger King",
            "Mac Donald",
            "Khu",
            2
        )
        questions.add(q)

        q = Questions(
            3,
            "What company this logo belongs to?",
            R.drawable.firefox,
            "Water Fox",
            "Fire Fox",
            "Fire Water",
            "Water Fire",
            2
        )
        questions.add(q)


        q = Questions(
            4,
            "What company this logo belongs to?",
            R.drawable.google,
            "Bing",
            "Salam",
            "Google",
            "Yahoo",
            3
        )
        questions.add(q)


        q = Questions(
            5,
            "What company this logo belongs to?",
            R.drawable.gucci,
            "D&G",
            "Vogue",
            "LC Man",
            "Gucci",
            4
        )
        questions.add(q)


        q = Questions(
            6,
            "What company this logo belongs to?",
            R.drawable.lego,
            "Lepo",
            "Io",
            "Lenovo",
            "Lego",
            4
        )
        questions.add(q)


        q = Questions(
            7,
            "What company this logo belongs to?",
            R.drawable.microsoft,
            "Windows",
            "Four Colors",
            "Microsoft",
            "Mac",
            3
        )
        questions.add(q)


        q = Questions(
            8,
            "What company this logo belongs to?",
            R.drawable.nestle,
            "Coffee",
            "Star Bucks",
            "Nestle",
            "Espresso",
            3
        )
        questions.add(q)


        q = Questions(
            9,
            "What company this logo belongs to?",
            R.drawable.playboy,
            "Play Boy",
            "Rabbit",
            "Bugs Bunny",
            "Looney Toones",
            1
        )
        questions.add(q)


        q = Questions(
            10,
            "What company this logo belongs to?",
            R.drawable.puma,
            "Jaguar",
            "Iran Khodro",
            "Puma",
            "Nike",
            3
        )
        questions.add(q)


        q = Questions(
            11,
            "What company this logo belongs to?",
            R.drawable.skodaauto,
            "Tesla",
            "IOT",
            "IOTA",
            "Skoda Auto",
            4
        )
        questions.add(q)


        q = Questions(
            12,
            "What company this logo belongs to?",
            R.drawable.snapchat,
            "Retrica",
            "Tapsi",
            "B6148",
            "Snap Chat",
            4
        )
        questions.add(q)


        q = Questions(
            13,
            "What company this logo belongs to?",
            R.drawable.spotify,
            "Spotify",
            "Google Cloud",
            "YouTube",
            "Shuffle",
            1
        )
        questions.add(q)


        q = Questions(
            14,
            "What company this logo belongs to?",
            R.drawable.starbucks,
            "Coffee",
            "Cappuccino",
            "Star Bucks",
            "3 in 1 Nescafe",
            3
        )
        questions.add(q)


        q = Questions(
            15,
            "What company this logo belongs to?",
            R.drawable.walmart,
            "Sun",
            "Shining",
            "Ebay",
            "Walmart",
            4
        )
        questions.add(q)


        return questions


    }

}
