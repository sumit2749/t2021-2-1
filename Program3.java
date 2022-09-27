import java.util.Scanner;

public class Program3 {
    public static void getList(int n) {
        if (n % 2 == 0) {
            n = n - 1;
        }

        for (int i = 1; i <= 2 * n; i = i + 2) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        getList(n);
    }
}