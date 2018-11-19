import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        Map<String, Double> dic = new HashMap<>(16);
        int buyCount;
        double singleMoney;
        String bookName;
        int numOfBooks = cin.nextInt();
        for (int i = 0; i < numOfBooks; ++i) {
            bookName = cin.next();
            singleMoney = cin.nextDouble();
            buyCount = cin.nextInt();
            dic.put(bookName, singleMoney * buyCount);
        }
        double booksMoney = getSum(dic);
        out.println(booksMoney);
    }

    private static double getSum(Map<String, Double> dic) {
        double ans = 0D;
        for (double now : dic.values()){
            ans += now;
        }
        return ans;
    }
}
