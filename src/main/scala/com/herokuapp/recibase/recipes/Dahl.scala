package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object Dahl {
  val recipe = Recipe(
    "Dahl",
    "dahl",
    Some("Vegetarian Cookery Bible (2012: Reader's Digest)"),
    Some("An Indian dish of lentils infused with spices."),
    None,
    Some(
      "Roasted nuts can also be added. Cook them until brown with a little oil in the small pan before adding the butter, cumin and onion."
    ),
    List.empty,
    None,
    List(
      Ingredient("Red lentils", "350g"),
      Ingredient(
        "Water",
        Some("800ml"),
        Some("boiling"),
        Some("Quantity is important!")
      ),
      Ingredient(
        "Ground turmeric",
        Some("1 tsp"),
        None,
        Some("Use 2-3 tsp instead")
      ),
      Ingredient("Chilli powder", Some("1/2 tsp")),
      Ingredient(
        "Ginger",
        Some("1 cm piece"),
        Some("peeled and finely chopped"),
        Some("Replace with ground ginger if necessary")
      ),
      Ingredient("Garlic", Some("2 cloves"), Some("finely chopped")),
      Ingredient(
        "Garam masala",
        Some("1/2 tsp"),
        None,
        Some("Use at least 1 tsp")
      ),
      Ingredient("Salt"),
      Ingredient("Butter", "25g approx"),
      Ingredient("Ground cumin", "1 tsp"),
      Ingredient("Onion", Some("1"), Some("diced"))
    ),
    List(
      "Boil the kettle and rinse the lentils.",
      "Put the lentils in a saucepan and cover with the boiling water.",
      "Add turmeric and chilli powder then bring the pan to the boil.",
      "Add the garlic and ginger to the pan.",
      "Cook the lentils for approx. 10 minutes.",
      "Add the garam masala.",
      "Heat the butter and cumin in a small pan and add the onions. Cook until soft.",
      "Mix the onions into the dahl and serve."
    )
  )
}
