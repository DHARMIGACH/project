class Speaker {
    String brand = "Samsung";
    String size;
    double cost;
    boolean output;

    // Constructor
    Speaker(String brand, String size, double cost, boolean output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // Default constructor
    Speaker() {
    }

    // Method to set details
    void setDetails(String brand, String size, double cost, boolean output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // Method to print all instance variables
    void printDetails() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Cost: " + cost + ", Output: " + output);
    }

    // Static method to demonstrate static variable assignment and usage
    static void displayCost() {
        double cost = 50000;
        System.out.println("Cost is: " + cost);
    }
}