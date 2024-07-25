public class Runner {
    public static void main(String[] args) {
        
        Matrimony matrimony = new Matrimony();
        matrimony.name = "Alice Johnson";
        matrimony.age = 28;
        matrimony.isMarried = true;
        System.out.println("Updated Matrimony Name: " + matrimony.name);
        System.out.println("Updated Matrimony Age: " + matrimony.age);
        System.out.println("Updated Matrimony isMarried: " + matrimony.isMarried);
       

        Application application = new Application();
        application.appName = "MyApp";
        application.version = "2.3";
        application.isRunning = false;
        System.out.println("Updated Application Name: " + application.appName);
        System.out.println("Updated Application Version: " + application.version);
        System.out.println("Updated Application Running: " + application.isRunning);

               

        Fruit fruit = new Fruit();
        fruit.fruitName = "Banana";
        fruit.weight = 120.0;
        fruit.isRipe = false;
        System.out.println("Updated Fruit Name: " + fruit.fruitName);
        System.out.println("Updated Fruit Weight: " + fruit.weight);
        System.out.println("Updated Fruit isRipe: " + fruit.isRipe);

        
        Juice juice = new Juice();
        juice.juiceName = "Apple Juice";
        juice.volume = 300.0;
        juice.isFresh = false;
        System.out.println("Updated Juice Name: " + juice.juiceName);
        System.out.println("Updated Juice Volume: " + juice.volume);
        System.out.println("Updated Juice isFresh: " + juice.isFresh);

        

        Place place = new Place();
        place.placeName = "Tokyo";
        place.country = "Japan";
        place.isTouristSpot = true;
        System.out.println("Updated Place Name: " + place.placeName);
        System.out.println("Updated Place Country: " + place.country);
        System.out.println("Updated Place isTouristSpot: " + place.isTouristSpot);


        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.brandName = "Smirnoff";
        alcoholBrand.alcoholPercentage = 35.0;
        alcoholBrand.isAvailable = true;
        System.out.println("Updated AlcoholBrand Name: " + alcoholBrand.brandName);
        System.out.println("Updated AlcoholBrand alcoholPercentage: " + alcoholBrand.alcoholPercentage);
        System.out.println("Updated AlcoholBrand isAvailable: " + alcoholBrand.isAvailable);

       

        Candy candy = new Candy();
        candy.candyName = "Twix";
        candy.price = 1.0;
        candy.isSweet = true;
        System.out.println("Updated Candy Name: " + candy.candyName);
        System.out.println("Updated Candy price: " + candy.price);
        System.out.println("Updated Candy isSweet: " + candy.isSweet);

        

        Medicine medicine = new Medicine();
        medicine.medicineName = "Ibuprofen";
        medicine.dosage = 200;
        medicine.isPrescriptionRequired = true;
        System.out.println("Updated Medicine Name: " + medicine.medicineName);
        System.out.println("Updated Medicine dosage: " + medicine.dosage);
        System.out.println("Updated Medicine isPrescriptionRequired: " + medicine.isPrescriptionRequired);

        

        Food food = new Food();
        food.foodName = "Burger";
        food.calories = 500;
        food.isVegetarian = false;
        System.out.println("Updated Food Name: " + food.foodName);
        System.out.println("Updated Food calories: " + food.calories);
        System.out.println("Updated Food isVegetarian: " + food.isVegetarian);
    }
}