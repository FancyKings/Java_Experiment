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
        int big = -0x3f3f3f3f, small = 0x3f3f3f3f;
        int bigPos = 0, smallPos = 0;
        String in = cin.nextLine();
        String[] inToSplit = in.split("\\s+");
        int[] inToDouble = new int[inToSplit.length];
        int i = 0;
        for (String now : inToSplit) {
            int judge = Integer.valueOf(now);
            if (judge > big) {
                big = judge;
                bigPos = i;
            }
            if (judge < small) {
                small = judge;
                smallPos = i;
            }
            inToDouble[i++] = judge;
            out.println(now);
        }
        inToDouble[bigPos] = inToDouble[0];
        inToDouble[0] = big;
        inToDouble[smallPos] = inToDouble[inToDouble.length - 1];
        inToDouble[inToDouble.length - 1] = small;
        for (int i1 : inToDouble) {
            out.println(i1);
        }
    }

}
