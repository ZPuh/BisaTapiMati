// Vehicle
public abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();
}

// Car
public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int maxSpeed, int numDoors) {
        super(brand, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
        maxSpeed += 10;
    }
}

// Bike
public class Bike extends Vehicle {
    private int numWheels;

    public Bike(String brand, int maxSpeed, int numWheels) {
        super(brand, maxSpeed);
        this.numWheels = numWheels;
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerating...");
        maxSpeed += 5; 
    }
}

// Boat
public class Boat extends Vehicle {
    private boolean hasSail;

    public Boat(String brand, int maxSpeed, boolean hasSail) {
        super(brand, maxSpeed);
        this.hasSail = hasSail;
    }

    @Override
    public void accelerate() {
        if (hasSail) {
            System.out.println("Boat accelerating...");
            maxSpeed += 15; 
        } else {
            System.out.println("Boat cannot accelerate without sail...");
        }
    }
}

// VehicleTest
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota", 100, 4);
        vehicles[1] = new Bike("Trek", 50, 2);
        vehicles[2] = new Boat("Yamaha", 80, true);

        for (Vehicle vehicle : vehicles) {
            vehicle.accelerate();
            System.out.println("Max speed after acceleration: " + vehicle.maxSpeed);
        }
    }
}
