package be.intecbrussel.sellers;

public class Stock {

	private int iceRockets;
	private int cones;
	private int balls;
	private int magni;

	public int getIceRockets() throws NoMoreIceCreamException {
		
		if (this.iceRockets <= 0)
			throw new NoMoreIceCreamException("Sorry! No more Ice Rockets.");
		else
			return iceRockets--;
	}

	public int getCones() throws NoMoreIceCreamException {
		if (this.cones <= 0)
			throw new NoMoreIceCreamException("Sorry! No more Cones.");
		else
			return cones--;
	}

	public int getBalls() throws NoMoreIceCreamException {
		if (this.balls <= 0)
			throw new NoMoreIceCreamException("Sorry! No more Balls.");
		else
			return balls--;
	}

	public int getMagni() throws NoMoreIceCreamException {
		if (this.magni <= 0)
			throw new NoMoreIceCreamException("Sorry! No more Magnums.");
		else
			return magni--;
	}

	public void setIceRockets(int iceRockets) {
		this.iceRockets = iceRockets;
	}

	public void setCones(int cones) {
		this.cones = cones;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public void setMagni(int magni) {
		this.magni = magni;
	}

}
