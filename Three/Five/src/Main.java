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
        String s = cin.next();
        String[] firstSplit = s.split(";");
        double[][] dic = new double[firstSplit.length][];
        for (int i = 0; i < firstSplit.length; ++i) {
            String[] secondSplit = firstSplit[i].split(",");
            dic[i] = new double[secondSplit.length];
            for (int j = 0; j < secondSplit.length; ++j) {
                dic[i][j] = Double.valueOf(secondSplit[j]);
            }
        }
        for (int i = 0; i < dic.length; ++i) {
            for (int j = 0; j < dic[i].length; ++j) {
                out.print("d[" + i + "," + j + "] = " + dic[i][j] + "  ");
            }
            out.println();
        }
    }

}