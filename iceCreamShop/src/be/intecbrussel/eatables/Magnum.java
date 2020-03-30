package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	MagnumType type;

	public Magnum() {
	}

	public Magnum(MagnumType type) {
		this.type = type;
	}

	public MagnumType getType() {
		return type;
	}

	public enum MagnumType {
		MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES
	}

	@Override
	public void eat() {
		System.out.println("You eat an " + this.type + " Magnum.");
	}
}
