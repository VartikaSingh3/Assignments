package DAY2;
import java.util.*;

public class charFreq {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String var2 = var1.nextLine();

        System.out.print("Enter a character to find its frequency: ");
        char var3 = var1.next().charAt(0);

        int var5 = 0;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            if (var2.charAt(var6) == var3) {
                var5++;
            }
        }

        System.out.println("Frequency of '" + var3 + "' = " + var5);
        var1.close();
    }
}