class DeliveryGuy {
    public static void deliver(String item) {
        System.out.println("DeliveryGuy is delivering");
        DeliveryVehicle.deliver(item, "Dollars Colony");
    }
}