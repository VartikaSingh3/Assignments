package DAY2;

public class wordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful language";
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}


