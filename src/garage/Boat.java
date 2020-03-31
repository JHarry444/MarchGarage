package garage;

public class Boat extends Vehicle {

	private String propulsionType;

	public Boat() {
		super();
	}

	public Boat(int weight, int topSpeed, int noOfWheels, String propulsionType) {
		super(weight, topSpeed, noOfWheels);
		this.propulsionType = propulsionType;
	}

	@Override
	public float calcBill() {
		return getWeight() * getTopSpeed();
	}

	public String getPropulsionType() {
		return propulsionType;
	}

	public void setPropulsionType(String propulsionType) {
		this.propulsionType = propulsionType;
	}

}