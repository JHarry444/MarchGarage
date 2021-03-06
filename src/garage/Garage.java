package garage;

import java.util.ArrayList;
import java.util.List;

import garage.exceptions.VehicleNotFoundException;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}

	public void removeVehiclesByType(Class<?> clazz) throws VehicleNotFoundException {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : vehicles) {
			if (v.getClass() == clazz) {
				toRemove.add(v);
			}
		}
		if (toRemove.isEmpty()) {
			throw new VehicleNotFoundException();
		}
		vehicles.removeAll(toRemove);
	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	public float calcBill() {
		float bill = 0f;
		for (Vehicle v : vehicles) {
			bill += v.calcBill();
		}
		return bill;
	}

	public void printVehicles() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}

}
