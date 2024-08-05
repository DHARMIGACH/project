class Rocket {
    String country = "USA";
    double speed;
    double fuelCapacity;
    int noOfThrusters;

    // Constructor
    Rocket(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

    // Default constructor
    Rocket() {
    }

    // Method to set details
    void setDetails(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

    // Method to print all instance variables
    void printDetails() {
        System.out.println("Country: " + country + ", Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters, No of Thrusters: " + noOfThrusters);
    }
}


