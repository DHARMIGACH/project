public class SimpleExample1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;
        
        initAndPrint(str1, str2, bool1, bool2, bool3);
    }
    
    public static void initAndPrint(String s1, String s2, boolean b1, boolean b2, boolean b3) {
        // Print initialized values
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Boolean 1: " + b1);
        System.out.println("Boolean 2: " + b2);
        System.out.println("Boolean 3: " + b3);
    }
}
