package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	private PriceList priceList;
	private double totalProfit;

	public IceCreamSalon(PriceList priceList) {
		this.priceList = priceList;
	}

	@Override
	public double getProfit() {
		return this.totalProfit;
	}

	@Override
	public Cone orderCone(Flavor[] flavors) {
		Cone cone = new Cone(flavors);
		this.totalProfit += this.priceList.getBallPrice() * flavors.length;
		return cone;
	}

	@Override
	public IceRocket orderIceRocket() {
		IceRocket iceRocket = new IceRocket();
		this.totalProfit += this.priceList.getRocketPrice();
		return iceRocket;
	}

	@Override
	public Magnum orderMagnum(MagnumType type) {
		Magnum magnum = new Magnum(type);
		this.totalProfit += this.priceList.getMagnumPrice(magnum.getType());
		return magnum;
	}

	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfit=" + totalProfit + "]";
	}

}
