package builder.pattern.drink;

import builder.pattern.Item;
import builder.pattern.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
                    return new Bottle();
	}

	@Override
	public abstract float price();
}