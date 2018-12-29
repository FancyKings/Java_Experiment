import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        int n = cin.nextInt();
        double up = 2, down = 1;
        double ans = 0D;
        for (int i = 0; i < n; ++i) {
            ans += up / down;
            double toUp = up;
            up += down;
            down = toUp;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        out.println(df.format(ans));
    }

}
