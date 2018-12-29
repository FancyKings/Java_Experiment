import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static Set<String> dic = new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return - o1.length() + o2.length();
        }
    });

    public static void main(String[] args) {
        int n = cin.nextInt();
        cin.nextLine();
        for (int i = 0; i < n; ++i) {
            dic.add(cin.nextLine());
        }
        Iterator<String> p = dic.iterator();
        out.println("The longest is: " + p.next());
    }

}
