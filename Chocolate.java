class Chocolate {
    String brand = "Cadbury";
    double price;
    String flavour;
    String size;

    // Constructor
    Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    // Default constructor
    Chocolate() {
    }

    // Method to set details
    void setDetails(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    // Method to print all instance variables
    void printDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Flavour: " + flavour + ", Size: " + size);
    }
}
