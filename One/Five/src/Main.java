import static java.lang.System.*;

import java.util.*;

public class Main {
    private static long cal(int i) {
        long ans = 1;
        while (i > 0) {
            ans *= i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int N = cin.nextInt();
            long ans = 0;
            for (int i = 1; i <= N; ++i) {
                ans += cal(i);
            }
            out.println(ans);
        }
    }
}
