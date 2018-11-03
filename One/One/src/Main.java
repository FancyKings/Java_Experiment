import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int a = cin.nextInt();
            if ((a % 4 == 0 && a % 100 != 0) || (a % 4 == 0 && a % 100 == 0)) {
                out.println("Yes");
            }
            else {
                out.println("No");
            }
        }
    }
}