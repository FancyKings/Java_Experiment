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
        int[] dic = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            dic[i] = cin.nextInt();
        }
        int m = cin.nextInt();
        int swapA, swapB;
        for (int i = 0; i < m; ++i) {
            swapA = cin.nextInt();
            swapB = cin.nextInt();
            int tempSwap = dic[swapB - 1];
            dic[swapB - 1] = dic[swapA - 1];
            dic[swapA - 1] = tempSwap;
        }
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                out.print(" ");
            }
            out.print(dic[i]);
        }
        out.println();
    }

}
