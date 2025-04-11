import java.util.Scanner;
class Vehicle {
    private String brand;
    private double speed;
    private String fuelType; 

    public Vehicle (String brand, double speed, String fuelType) {
    this.brand = brand;
    this.speed = speed;
    this.fuelType = fuelType;
    }
    public String getBrand() {
    return brand;
    }
    public double getSpeed() {
    return speed;
    }
    public String getFuelType() {
    return fuelType;
    }
    public void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Speed: " + speed);
    System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, double speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle (String brand, double speed, String fuelType, boolean hasSideCar) {
    super(brand, speed, fuelType);
    this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Has SideCar: " + (hasSideCar ? "Yes" : "No"));
    }
}

public class TestVehicle {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Car Details");
    System.out.print("Brand: ");
    String carBrand = scan.nextLine();
    System.out.print("Speed: ");
    double carSpeed = scan.nextDouble();

    scan.nextLine(); 

    System.out.print("Fuel Type: ");
    String carFuel = scan.nextLine();
    System.out.print("Number of Doors: ");
    int numDoors = scan.nextInt();

    scan.nextLine();

    System.out.println("\nEnter Motorcycle Details");
    System.out.print("Brand: ");
    String motorBrand = scan.nextLine();
    System.out.print("Speed: ");
    double motorSpeed = scan.nextDouble();
    
    scan.nextLine(); 

    System.out.print("Fuel Type: ");
    String motorFuel = scan.nextLine();
    System.out.print("Has Sidecar? (Yes/No): ");
    String sideCarInput = scan.nextLine().trim().toLowerCase();
    boolean hasSideCar = sideCarInput.equals("yes");

    Vehicle car = new Car(carBrand, carSpeed, carFuel, numDoors);
    Vehicle motorcycle = new Motorcycle(motorBrand, motorSpeed, motorFuel, hasSideCar);

    System.out.println("\nCar Details: ");
    car.displayInfo();
    System.out.println();

    System.out.println("Motorcycle Details:");
    motorcycle.displayInfo();

    scan.close();
    }
}




