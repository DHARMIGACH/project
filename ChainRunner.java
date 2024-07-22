class ChainRunner {
    public static void main(String[] args) {
        String carat = Chain.carat();
        System.out.println("Carat of chain : " + carat);

        float cost = Chain.cost();
        System.out.println("Cost per gram : " + cost);

        String type = Chain.type();
        System.out.println("Type of gold : " + type);

        String quality = Chain.quality();
        System.out.println("Quality of chain : " + quality);

        int quantity = Chain.quantity();
        System.out.println("Quantity of the chain : " + quantity);

        String waste = Chain.wastage();
        System.out.println("Wastage of the chain : " + waste);

        String Charges = Chain.serviceCharge();
        System.out.println("Service charges of the chain : " + Charges);

        String GST = Chain.gst();
        System.out.println("Gst of the chain : " + GST);
    }
}