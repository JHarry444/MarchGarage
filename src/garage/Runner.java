package garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g = new Garage();
		g.addVehicle(new Car());
		g.removeVehiclesByType(Car.class);
	}

}
