public class Main1 {
    public static void main(String[] args) {
        // Speaker instances
        Speaker speaker1 = new Speaker("Sony", "Medium", 299.99, true);
        speaker1.printDetails();

        Speaker speaker2 = new Speaker("Bose", "Large", 499.99, false);
        speaker2.printDetails();

        Speaker speaker3 = new Speaker();
        speaker3.brand = "JBL";
        speaker3.size = "Small";
        speaker3.cost = 199.99;
        speaker3.output = true;
        speaker3.printDetails();

        Speaker speaker4 = new Speaker();
        speaker4.setDetails("Marshall", "Extra Large", 699.99, true);
        speaker4.printDetails();

        Speaker.displayCost();

        // Rocket instances
        Rocket rocket1 = new Rocket("India", 10000, 5000, 4);
        rocket1.printDetails();

        Rocket rocket2 = new Rocket("Russia", 15000, 7000, 6);
        rocket2.printDetails();

        Rocket rocket3 = new Rocket();
        rocket3.country = "China";
        rocket3.speed = 12000;
        rocket3.fuelCapacity = 6000;
        rocket3.noOfThrusters = 5;
        rocket3.printDetails();

        Rocket rocket4 = new Rocket();
        rocket4.setDetails("USA", 18000, 8000, 8);
        rocket4.printDetails();

        // Chocolate instances
        Chocolate chocolate1 = new Chocolate("Mars", 2.5, "Milk Chocolate", "Small");
        chocolate1.printDetails();

        Chocolate chocolate2 = new Chocolate("Lindt", 5.0, "Dark Chocolate", "Medium");
        chocolate2.printDetails();

        Chocolate chocolate3 = new Chocolate();
        chocolate3.brand = "Ferrero Rocher";
        chocolate3.price = 3.5;
        chocolate3.flavour = "Hazelnut";
        chocolate3.size = "Large";
        chocolate3.printDetails();

        Chocolate chocolate4 = new Chocolate();
        chocolate4.setDetails("Nestle", 1.5, "White Chocolate", "Small");
        chocolate4.printDetails();

        // Projector instances
        Projector projector1 = new Projector("Sony", "LCD", "White", 2.5);
        projector1.printDetails();

        Projector projector2 = new Projector("BenQ", "DLP", "Black", 3.0);
        projector2.printDetails();

        Projector projector3 = new Projector();
        projector3.company = "LG";
        projector3.type = "LED";
        projector3.color = "Silver";
        projector3.weight = 2.8;
        projector3.printDetails();

        Projector projector4 = new Projector();
        projector4.setDetails("Optoma", "Laser", "Gray", 3.2);
        projector4.printDetails();

        // Paper instances
        Paper paper1 = new Paper(0.2, "A4", "High", "White");
        paper1.printDetails();

        Paper paper2 = new Paper(0.3, "A3", "Medium", "Yellow");
        paper2.printDetails();

        Paper paper3 = new Paper();
        paper3.thickness = 0.15;
        paper3.size = "A5";
        paper3.quality = "Low";
        paper3.color = "Blue";
        paper3.printDetails();

        Paper paper4 = new Paper();
        paper4.setDetails(0.25, "A6", "High", "Green");
        paper4.printDetails();
    }
}
