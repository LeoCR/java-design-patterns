package builder.pattern.burger;

import builder.pattern.Item;
import builder.pattern.Packing;
import builder.pattern.Wrapper;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}