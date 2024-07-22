class DeliveryVehicle {
    public static void deliver(String item, String location) {
        System.out.println("DeliveryVehicle is delivering");
        Company.deliver(item,location);
    }
}
