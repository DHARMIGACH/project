class Company {
    int id;
    String name;
    String location;
    SoftwareEngineer softwareEngineer;

    Company(int id, String name, String location, SoftwareEngineer softwareEngineer) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.softwareEngineer = softwareEngineer;
    }

    void printDetails() {
        System.out.println("Company ID: " + id + ", Name: " + name + ", Location: " + location);
        softwareEngineer.printDetails();
    }
}

