import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int flag = 0;
        for (int i = 100; i < 1000; ++i) {
            int x = i, sum = 0;
            while (x > 0) {
                sum += (x % 10) * (x % 10) * (x % 10);
                x /= 10;
            }
            if (sum == i) {
                if (flag++ != 0) {
                    out.print(",");
                }
                out.printf("%d", sum);
            }
        }
    }
}
