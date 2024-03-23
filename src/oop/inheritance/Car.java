package oop.inheritance;

public class Car {
	public String wheelStatus;
    public int noOfWheels;
    
    //Constructor
    public Car(String wheelStatus, int noOfWheels)
    {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
    
    //Method 1
    public void applyBrake()
    {
        wheelStatus = "Stop";
          System.out.println("Stop the car using break");
    }

    //Method 2
    public String toString()
    {
        return ("No of wheels in car " + noOfWheels + "\n"
                + "status of the wheels " + wheelStatus);
    }
}
