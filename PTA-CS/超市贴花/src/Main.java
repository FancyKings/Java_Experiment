import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 最后一个测试点不过,目前未知
 *
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static Map<Integer, Integer> dic = new HashMap<>(16);

    public static void main(String[] args) {
        final int maxDic = 100;
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            int now = cin.nextInt();
            if (dic.containsKey(now)) {
                dic.put(now, dic.get(now) + 1);
            } else {
                dic.put(now, 1);
            }
        }
        out.println(dic);
        int ans = 0;
        for (int i = 1; i < maxDic; ++i) {
            if (dic.containsKey(i) && dic.containsKey(i + 1) && dic.containsKey(i + 2)) {
                if (dic.get(i) == 0 || dic.get(i + 1) == 0 || dic.get(i + 2) == 0) {
                    continue;
                }
                ans++;
                dic.put(i, dic.get(i) - 1);
                dic.put(i + 1, dic.get(i + 1) - 1);
                dic.put(i + 2, dic.get(i + 2) - 1);
                --i;
            }
        }
        out.println(ans);
    }

}
