package DAY2;

public class decInc {
    static void printDecInc(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");  // decreasing part
        printDecInc(n - 1);
        System.out.print(n + " ");  // increasing part
    }

    public static void main(String[] args) {
        printDecInc(3);
    }
}
