package oop.inheritance;

public class Honda extends Car {
	public Boolean alloyWheel;

	// constructor
	public Honda(String wheelStatus, int noOfWheels, Boolean alloyWheel) {
		// invoking super-class(Car) constructor
		super(wheelStatus, noOfWheels);
		this.alloyWheel = alloyWheel;
	}

	// method 1
	public void setAlloyWheel(Boolean alloyWheel) {
		this.alloyWheel = alloyWheel;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nCar alloy wheel " + alloyWheel);
	}
}
