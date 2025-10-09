

// Base class
class Vehicle {
    String brand;
    int year;

    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("🚗 Vehicle Info");
        System.out.println("Brand: " + brand);
        System.out.println("Year : " + year);
    }
}

// Derived class: Car
class Car extends Vehicle {
    int wheels;

    Car(String brand, int year, int wheels) {
        // Using super to call parent class constructor
        super(brand, year);
        this.wheels = wheels;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent displayInfo()
        System.out.println("Wheels: " + wheels);
    }
}

// Derived class: ElectricCar
class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, int wheels, int batteryCapacity) {
        // Constructor chaining using super
        super(brand, year, wheels);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh ⚡");
    }

    // Main method
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 2023, 4, 100);
        tesla.displayInfo();
    }
}
