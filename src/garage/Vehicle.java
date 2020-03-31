package garage;

public abstract class Vehicle {

	private int weight;
	private int topSpeed;
	private int noOfWheels;

	public Vehicle() {
		super();
	}

	public Vehicle(int weight, int topSpeed, int noOfWheels) {
		super();
		this.weight = weight;
		this.topSpeed = topSpeed;
		this.noOfWheels = noOfWheels;
	}

	public abstract float calcBill();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [weight=" + weight + ", topSpeed=" + topSpeed + ", noOfWheels=" + noOfWheels + "]";
	}
}
