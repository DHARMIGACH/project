public class Application {
    public void run() {
        System.out.println("Application is running.");
        Internet internet = new Internet();
        internet.stream();
    }
}
