package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {
	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;// TODO what is an standard

	public PriceList() {
	}

	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public double getRocketPrice() {
		return rocketPrice;
	}

	public double getMagnumPrice(MagnumType type) {
		double price = magnumStandardPrice;
		if (type.equals(MagnumType.ALPINENUTS))
			price = magnumStandardPrice * 1.5;
		if (type.equals(MagnumType.ROMANTICSTRAWBERRIES))
			price = magnumStandardPrice * 1.5;
		return price;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	@Override
	public String toString() {
		return "PriceList [ballPrice=" + ballPrice + ", rocketPrice=" + rocketPrice + ", magnumStandardPrice="
				+ magnumStandardPrice + "]";
	}

}
