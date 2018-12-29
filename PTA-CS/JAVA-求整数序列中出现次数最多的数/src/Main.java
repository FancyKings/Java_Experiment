import java.io.*;
import java.util.*;

/**
 * 要求统计一个整型序列中出现次数最多的整数及其出现次数。
 *
 * @author Fancyking
 */
public class Main {

    private static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static Map<Integer, Integer> dic = new HashMap<>(16);

    public static void main(String[] args) throws IOException {
        cin.nextToken();
        int now;
        int n = (int) cin.nval;
        for (int i = 0; i < n; ++i) {
            cin.nextToken();
            now = (int) cin.nval;
            if (dic.containsKey(now)) {
                dic.put(now, dic.get(now) + 1);
            } else {
                dic.put(now, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> reDic = new ArrayList<>(dic.entrySet());
        reDic.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        Iterator<Map.Entry<Integer, Integer>> itp = reDic.iterator();
        Map.Entry<Integer, Integer> outAns = itp.next();
        out.println(outAns.getKey() + " " + outAns.getValue());
    }

}
