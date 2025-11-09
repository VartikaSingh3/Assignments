package DAY2;
import java.util.*;

public class power {
    static int Power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * Power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + Power(base, exp));
        sc.close();
    }
}


