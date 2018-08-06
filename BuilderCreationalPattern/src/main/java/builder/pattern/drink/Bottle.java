package builder.pattern.drink;

import builder.pattern.Packing;

public class Bottle implements Packing {
   @Override
   public String pack() {
      return "Bottle";
   }
}
