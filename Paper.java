class Paper {
    double thickness = 0.1;
    String size;
    String quality;
    String color;

    // Constructor
    Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    // Default constructor
    Paper() {
    }

    // Method to set details
    void setDetails(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    // Method to print all instance variables
    void printDetails() {
        System.out.println("Thickness: " + thickness + " mm, Size: " + size + ", Quality: " + quality + ", Color: " + color);
    }
}
