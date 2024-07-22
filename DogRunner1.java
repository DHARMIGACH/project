class Dog {
    public static void guarding(String location) {
        System.out.println("running guarding in Dog");
        System.out.println("location: " + location);
    }
}

class House {
    public static void watch(String location) {
        System.out.println("running watch in house");
        Dog.guarding("Dollars Colony");
        System.out.println("dog guarding at location: " + location);
    }
}

public class DogRunner1{
    public static void main(String[] args) {
        House.watch("Gate");
    }
}
