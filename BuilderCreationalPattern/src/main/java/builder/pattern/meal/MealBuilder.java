package builder.pattern.meal;

import builder.pattern.drink.Coke;
import builder.pattern.drink.Pepsi;
import builder.pattern.burger.ChickenBurger;
import builder.pattern.burger.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
