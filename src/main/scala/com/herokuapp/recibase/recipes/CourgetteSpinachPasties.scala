package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object CourgetteSpinachPasties {
  val recipe = Recipe(
    "Courgette and spinach pasties",
    "courgette-spinach-pasties",
    List(
      Ingredient("Courgettes", "2"),
      Ingredient("Soft Goats Cheese", "1"),
      Ingredient("Spinach", Some("3 handfulls"), Some("roughly chopped")),
      Ingredient("All Butter Puff Pastry", "320g"),
      Ingredient("Flour", None, None, Some("to thicken mixture")),
      Ingredient("Nutmeg"),
      Ingredient("Lemon Juice"),
      Ingredient("Salt"),
      Ingredient("Pepper")
    ),
    List(
      "Grate the courgettes using a fine grater, then strain the result in a sieve.",
      "Mix the grated courgette, goats cheese, lemon juice, nutmeg and spinach in a pan on a low heat.",
      "Bring to a very gentle simmer then turn off the heat.",
      "Sift in a small amount of flour to thicken the mixure.",
      "Leave the mixture to cool for a few minutes and lay out the pastry, cutting it into two pieces.",
      "Place half the mixture on one side of each pastry, leaving at least a cm at the edges",
      "Fold the other side of each pastry over the top of the mixture. Merge the edges of the pastry by pressing down with the tines of a fork.",
      "Make a 2-3cm slice in the top of each pastry, to let out steam.",
      "Bake in the oven at 220C/200C fan/gas 7 for 20 minutes."
    )
  )
}
