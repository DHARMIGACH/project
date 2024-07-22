class BloodRunner {
    public static void main(String[] args) {
        char group = Blood.group();
        System.out.println("Blood group : " + group);

        String personName = Blood.personName();
        System.out.println("Person Name : " + personName);

        double cost = Blood.cost();
        System.out.println("Cost : " + cost);

        String Tested = Blood.hospitalTested();
        System.out.println("Hospital Tested : " + Tested);

        String Sick = Blood.sickness();
        System.out.println("Sick detected : " + Sick);

        boolean donate = Blood.donate();
        System.out.println("Blood Donated : " + donate);
    }
}