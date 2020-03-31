package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) throws NoMoreIceCreamException {
		PriceList priceList = new PriceList(1, 2, 2);
		IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

		// Order some ice cream
		Magnum alpinenutsMagnum = iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS);
		Magnum blackChocolateMagnum = iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE);
		IceRocket iceRocket = iceCreamSeller.orderIceRocket();
		Flavor[] flavors = { Flavor.MOKKA, Flavor.PISTACHE };
		Cone cone = iceCreamSeller.orderCone(flavors);

		// Call van eat()
		Eatable[] iceList = { alpinenutsMagnum, blackChocolateMagnum, iceRocket, cone };
		for (Eatable eatable : iceList) {
			eatable.eat();
		}

		// Print the profit of the ice cream seller
		System.out.println("The profit of this ice cream seller is: " + iceCreamSeller.getProfit() + " euro");

	}

}
