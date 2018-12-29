import java.io.*;
import java.text.DecimalFormat;

/**
 * Loading~
 *
 * @author Fancyking
 */
public class Main {

    private static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) throws IOException {
        double ans = 0D;
        int inputNum, zCount = 0, fCount = 0;
        while (cin.nextToken() != StreamTokenizer.TT_EOF) {
            inputNum = (int) cin.nval;
            if (inputNum == 0) {
                break;
            }
            if (inputNum > 0) {
                zCount++;
            } else {
                fCount++;
            }
            ans += (double) inputNum;
        }
        out.println(zCount);
        out.println(fCount);
        out.println(new DecimalFormat("0").format(ans));
        out.println(ans / (zCount + fCount));
    }

}
