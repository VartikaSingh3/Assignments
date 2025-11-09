package DAY2;
import java.util.*;

public class countDigits {
    static int count(int n) {
        if (n == 0)
            return 0;
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Total digits = " + count(n));
        sc.close();
    }
}
