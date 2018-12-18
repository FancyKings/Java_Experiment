import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        final String sort1 = "sort1";
        final String sort2 = "sort2";
        int idCount = Integer.valueOf(cin.nextLine());
        String cmd;
        List<String> dic = new ArrayList<>(idCount);

        for (int i = 0; i < idCount; ++i) {
            dic.add(cin.nextLine());
        }

        while (cin.hasNext()) {
            cmd = cin.nextLine();
            if (sort1.equals(cmd)) {
                sortOne(dic);
            } else if (sort2.equals(cmd)) {
                sortTwo(dic);
            } else {
                out.println("exit");
                return;
            }
        }
    }

    private static void sortTwo(List<String> dic) {
        dic.sort(Comparator.comparing(o -> o.substring(6, 14)));

        for (String now : dic) {
            out.println(now.toString());
        }
    }

    private static void sortOne(List<String> dic) {
        List<String> slt = new ArrayList<>(16);
        String choose;

        for (String now : dic) {
            choose = now.substring(6, 10) + "-" + now.substring(10, 12) + "-" + now.substring(12, 14);
            slt.add(choose);
        }
        slt.sort(String::compareTo);

        for (String now : slt) {
            out.println(now.toString());
        }
    }

}
