import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // https://pl.spoj.com/problems/PRZEDSZK/

        int N = scanner.nextInt();
        scanner.nextLine();

        while (N > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println(NWW(a, b));
            N--;
        }


    }

    static int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    static int NWW(int a, int b) {
        return a * b / NWD(a, b);
    }


}
