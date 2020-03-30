package be.intecbrussel.eatables;

public class Cone implements Eatable {
	Flavor[] balls;

	public Cone() {
	}

	public Cone(Flavor[] balls) {
		this.balls = balls;
	}

	public enum Flavor {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
	}

	@Override
	public void eat() {
		System.out.println("You eat an cone with this/these flavor(s): ");
		for (Flavor flavor : balls) {
			System.out.println(flavor.name() + ", ");
		}

	}
}
