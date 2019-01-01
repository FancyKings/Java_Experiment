import java.io.*;
import java.text.DecimalFormat;

/**
 * 知道BUG在哪里了，应该是输入0，什么都不输出，改了这个地方，第二个样例就过了
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
        if (zCount + fCount != 0) {
            out.println(zCount);
            out.println(fCount);
            out.println(new DecimalFormat("0").format(ans));
            out.println(ans / (zCount + fCount));
        }
    }

}
