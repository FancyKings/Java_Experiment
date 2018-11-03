import static java.lang.System.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int in = cin.nextInt();
            int biggest = 0;
            while (in > 0) {
                biggest = Math.max(biggest, in % 10);
                in /= 10;
            }
            out.printf("%d\n", biggest);
        }
    }
}