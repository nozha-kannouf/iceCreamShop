package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {

	private PriceList priceList;
	private Stock stock;
	private double profit;

	public IceCreamCar(PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}

	@Override

	public double getProfit() {
		return this.profit;
	}

	private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
		if (this.stock.getCones() < 0)
			throw new NoMoreIceCreamException();
		else
			return new Cone(balls);
	}
	@Override
	public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {
		
		this.profit += this.priceList.getBallPrice() * balls.length;
		return prepareCone(balls);
	}

	private IceRocket prepareRocket() throws NoMoreIceCreamException {
		if (this.stock.getIceRockets() < 0)
			throw new NoMoreIceCreamException();
		else
			return new IceRocket();
	}

	@Override
	public IceRocket orderIceRocket() throws NoMoreIceCreamException {
		this.profit += this.priceList.getRocketPrice();
		return prepareRocket();
	}

	private Magnum prepareMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
		if (this.stock.getMagni() < 0)
			throw new NoMoreIceCreamException();
		else
			return new Magnum(magnumType);
	}
	@Override
	public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
		this.profit += this.priceList.getMagnumPrice(type);
		return prepareMagnum(type);
	}

}
