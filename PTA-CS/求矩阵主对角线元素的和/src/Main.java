import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        int n = cin.nextInt();
        int cnt = 0;
        double sum = 0D;
        for (int i = 0; i < n * n; ++i) {
            double now = cin.nextDouble();
            if (i == cnt) {
                cnt += n + 1;
                sum += now;
            }
        }
        out.println(sum);
    }

}

/*
1 2 3 4
5 6.5 7 8
9 10 11 12
13 14 15 16
 */