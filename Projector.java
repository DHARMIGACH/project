class Projector {
    String company = "Epson";
    String type;
    String color;
    double weight;

    // Constructor
    Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    // Default constructor
    Projector() {
    }

    // Method to set details
    void setDetails(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    // Method to print all instance variables
    void printDetails() {
        System.out.println("Company: " + company + ", Type: " + type + ", Color: " + color + ", Weight: " + weight + " kg");
    }
}
