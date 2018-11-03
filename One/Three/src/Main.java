
import static java.lang.System.*;

import java.util.*;

public class Main {
    static boolean OK(int k) {
        int up = (int) (Math.sqrt(k)) + 1;
        for (int i = 2; i < up; ++i) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int N = cin.nextInt(), flag = 0;
            for (int i = 2; i <= N; ++i) {
                if (OK(i)) {
                    if (flag++ != 0) {
                        out.print(",");
                    }
                    out.print(i);
                }
            }
            out.println();
        }
    }
}
