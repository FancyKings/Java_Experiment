import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static ArrayList<Integer> dic = new ArrayList<>(16);

    public static void main(String[] args) {
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            dic.add(cin.nextInt());
        }
        int k = cin.nextInt();
        for (int i = 0; i < k; ++i) {
            int removeID = cin.nextInt();
            remove(removeID);
        }
        for (int i = 0; i < dic.size(); ++i) {
            if (i != 0) {
                out.print(" ");
            }
            out.print(dic.get(i));
        }
        out.println();
    }

    private static void remove(int removeID) {
        Iterator<Integer> p = dic.iterator();
        int cnt = 0;
        while (cnt < removeID && p.hasNext()) {
            p.next();
            cnt++;
        }
        if (cnt == removeID) {
            p.remove();
        }
    }

}
