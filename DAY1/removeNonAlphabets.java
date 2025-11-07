public class removeNonAlphabets {
    public static void main(String[] args) {
        String str = "He110 W@rld! 123";

        // Replace all non-alphabetic characters with empty string
        String result = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("Original String: " + str);
        System.out.println("Alphabetic Only: " + result);
    }
}

