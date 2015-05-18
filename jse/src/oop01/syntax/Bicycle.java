package oop01.syntax;

public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int NUMBER_OF_BIC = 0;

	public Bicycle(int startCadence, int startgear, int startspeed) {
		super();
		this.cadence = startCadence;
		this.gear = startgear;
		this.speed = startspeed;
		this.id = ++NUMBER_OF_BIC;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newValue) {
		this.cadence = newValue;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int newVlaue) {
		this.gear = newVlaue;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void applyBrake(int decrement){
		speed -=decrement;
	}
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	

}
