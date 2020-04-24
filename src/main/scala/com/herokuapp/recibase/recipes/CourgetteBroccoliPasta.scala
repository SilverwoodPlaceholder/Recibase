package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object CourgetteBroccoliPasta
    extends Recipe(
      "Courgette & Broccoli Pasta",
      "courgette-broccoli-pasta",
      Some("Gousto"),
      None,
      None,
      Some(
        """If tagliatelle is unavailable try spaghetti.
          |
          |You can use garlic paste instead if you add it to the stock, rather than cooking it with the courgettes.""".stripMargin
      ),
      List(
        Ingredient("Courgette", Some("1"), Some("roughly chopped")),
        Ingredient("Tenderstem broccoli", Some("120g"), Some("halved")),
        Ingredient("Fresh tagliatelle", "190g"),
        Ingredient("Garlic", Some("3 cloves"), Some("finely chopped")),
        Ingredient("Baby spinach", "80g"),
        Ingredient("Parmesan", None, Some("grated")),
        Ingredient("Lemon juice"),
        Ingredient("Dried chilli flakes"),
        Ingredient("Flaked almonds", Some("handful"), None, Some("optional")),
        Ingredient("Vegetable stock"),
        Ingredient("Olive oil")
      ),
      List(
        "Dissolve the stock in 200ml of boiling water",
        "Heat some olive oil on a medium/high heat in a wide pan",
        "Cook the courgettes and garlic for 4-5 minutes or until starting to soften, then turn off the heat",
        "Cook the tagliatelle and broccoli, in a pan of boiling water, for 3 minutes",
        "Drain the tagliatelle and broccoli then add it to the courgette pan",
        "Add the lemon juice, chilli flakes, parmesan, spinach and stock",
        "Cook on a medium heat for 2 minutes until the sauce has thickened and the spinach wilted"
      )
    )
