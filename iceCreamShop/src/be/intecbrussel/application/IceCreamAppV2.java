package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
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

		try {
			Magnum alpinenutsMagnum = iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS);
			Magnum blackChocolateMagnum = iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE);
			IceRocket iceRocket = iceCreamSeller.orderIceRocket();
			IceRocket iceRocket2 = iceCreamSeller.orderIceRocket();
			//IceRocket iceRocket3 = iceCreamSeller.orderIceRocket();
			
			Flavor[] flavors = { Flavor.MOKKA, Flavor.PISTACHE };
			Cone cone = iceCreamSeller.orderCone(flavors);
		} catch (NoMoreIceCreamException nmice) {
			System.out.println(nmice.getMessage());

		}
		System.out.println("The profit of this ice cream seller is: " + iceCreamSeller.getProfit() + " euro");


	}

}
