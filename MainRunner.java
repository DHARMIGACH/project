
public class MainRunner {
    public static void main(String[] args) {
        Owner owner = new Owner("Alice", 45, "Female");
        Hotel hotel = new Hotel("Sunrise Inn", owner);
        hotel.printDetails();

        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Bob", 5, "Senior Developer", 85000);
        Company company = new Company(1, "Tech Solutions", "New York", softwareEngineer);
        company.printDetails();

        CapitalCity capitalCity = new CapitalCity("Springfield", 150000);
        State state = new State("Illinois", "English", capitalCity);
        Country country = new Country("USA", "North America", state);
        country.printDetails();
    }
}
