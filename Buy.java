class Buy {

    public static void product(String brand, double price) {
        if (price > 700) {
            System.out.println("valid price"+brand);
        } else {
            System.out.println("Invalid Price "+price);
        }
    }

    public static void product(String name, int quantity, String unit, double price) {
        if (quantity > 40 && price > 500) {
            System.out.println("Valid  " + name + "     Quantity" + quantity + "     " + unit + "     Price " + price);
        } else {
            System.out.println("Invalid Quantity and Price must be greater than 0"+quantity);
        }
    }

    public static void bookMovieTicket(String name, String theaterName, int quantity, double price) {
        if (quantity > 0 && price > 200) {
            System.out.println("Valid: " + name + ", Theater: " + theaterName + "    Quantity: " + quantity + "        Price: " + price);
        } else {
            System.out.println("Invalid: Quantity and Price must be greater than 200"+quantity);
        }
    }

    public static void buyEgg(int total, double pricePerEgg) {
        if (total > 0 && pricePerEgg > 7) {
            System.out.println("Valid: Total Eggs: " + total + ", Price per Egg: " + pricePerEgg);
        } else {
            System.out.println("Invalid: Total and Price per Egg must be greater than 7");
        }
    }

    public static void buyShampoo(int quantityInMl, double price, String brand, String manfDate) {
        if (quantityInMl > 0 && price > 70) {
            System.out.println("Valid: Quantity: " + quantityInMl + "ml, Price: " + price + ", Brand: " + brand + ", Manufacture Date: " + manfDate);
        } else {
            System.out.println("Invalid: Quantity and Price must be greater than 70");
        }
    }

    public static void buyCake(char size, String type, String flavour, double cost, int quantity) {
        if (cost > 150 && quantity > 0) {
            System.out.println("Valid: Size: " + size + ", Type: " + type + ", Flavour: " + flavour + ", Cost: " + cost + ", Quantity: " + quantity);
        } else {
            System.out.println("Invalid Cost and Quantity"+cost+"and"+quantity+" must be greater than 0");
        }
    }

    public static void buyLaptop(String brand, int serialNo, double price, int batteryCapacity, double screenSize, String os, int harddiskSize, int ramSize) {
        if (price > 70 && batteryCapacity > 0 && screenSize > 0 && harddiskSize > 0 && ramSize > 0) {
            System.out.println("Valid: Brand: " + brand + ", Serial No: " + serialNo + ", Price: " + price + ", Battery Capacity: " + batteryCapacity + "mAh, Screen Size: " + screenSize + " inches, OS: " + os + ", Harddisk Size: " + harddiskSize + "GB, RAM: " + ramSize + "GB");
        } else {
            System.out.println("Invalid: Price, Battery Capacity, Screen Size, Harddisk Size, and RAM Size must be greater than 0");
        }
    }

    public static void buySmartWatch(String brand, double price, int color, char type, int mode) {
        if (price > 400) {
            System.out.println("Valid: Brand: " + brand + ", Price: " + price + ", Color: " + color + ", Type: " + type + ", Mode: " + mode);
        } else {
            System.out.println("Invalid: Price must be greater than 400");
        }
    }

    public static void main(String[] args) {
        Buy.product("Lee", 800);
        Buy.product("Lee", -200);
        Buy.product("Milk", 50, "liters", 600);
        Buy.product("Milk", -30, "liters", -50);
        Buy.bookMovieTicket("Inception", "IMAX", 3, 900);
        Buy.bookMovieTicket("Inception", "IMAX", -3, -900);
        Buy.buyEgg(12, 8);
        Buy.buyEgg(-12, -5);
        Buy.buyShampoo(250, 200, "Dove", "2023-07-01");
        Buy.buyShampoo(-250, -200, "Dove", "2023-07-01");
        Buy.buyCake('L', "Birthday", "Chocolate", 1500, 1);
        Buy.buyCake('L', "Birthday", "Chocolate", -1500, -1);
        Buy.buyLaptop("Dell", 123456, 75000, 6000, 15.6, "Windows 10", 512, 16);
        Buy.buyLaptop("Dell", 123456, -75000, -6000, -15.6, "Windows 10", -512, -16);
        Buy.buySmartWatch("Apple", 35000, 1, 'A', 3);
        Buy.buySmartWatch("Apple", -35000, 1, 'A', 3);
    }
}
