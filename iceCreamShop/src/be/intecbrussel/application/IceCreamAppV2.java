package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		Stock stock = new Stock();
		PriceList priceList = new PriceList(1, 2, 2);
		stock.setIceRockets(2);
		stock.setCones(10);
		stock.setBalls(10);
		stock.setMagni(10);
		IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);
		Flavor[] flavors = { Flavor.MOKKA, Flavor.PISTACHE };
		Magnum alpinenutsMagnum = null;
		Magnum blackChocolateMagnum = null;
		IceRocket iceRocket = null;
		IceRocket iceRocket2 = null;
		IceRocket iceRocket3 = null;
		Cone cone = null;

		try {
			alpinenutsMagnum = iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS);
			blackChocolateMagnum = iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE);
			iceRocket = iceCreamSeller.orderIceRocket();
			cone = iceCreamSeller.orderCone(flavors);
			iceRocket2 = iceCreamSeller.orderIceRocket();
			iceRocket3 = iceCreamSeller.orderIceRocket();

		} catch (NoMoreIceCreamException nmice) {
			System.out.println(nmice.getMessage());

		}
		// Call van eat()
		System.out.println("iceRocket3" + iceRocket3);
		Eatable[] iceList = { alpinenutsMagnum, blackChocolateMagnum, iceRocket, iceRocket2, iceRocket3, cone };
		for (Eatable eatable : iceList) {
			if (eatable != null)
				eatable.eat();
		}
		System.out.println("The profit of this ice cream seller is: " + iceCreamSeller.getProfit() + " euro");

	}

}
