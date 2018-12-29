import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Fancyking
 */
public class Main {

    final private static String END = "!!!!!";
    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static Map<String, Integer> dcDic = new HashMap<>(16);

    public static void main(String[] args) {
        readInData();
        List<Map.Entry<String, Integer>> toListMap = sortDcDic();
        topPrint(toListMap);
    }

    private static void topPrint(List<Map.Entry<String, Integer>> toListMap) {
        int cnt = 0;
        out.println(toListMap.size());
        for (Map.Entry<String, Integer> now : toListMap) {
            out.println(now.getKey());
            if (++cnt == 10) {
                break;
            }
        }
    }

    private static void readInData() {
        String input;
        while (cin.hasNextLine()) {
            input = cin.nextLine();
            input = input.trim();
            if (END.equals(input)) {
                break;
            }
            if ("".equals(input)) {
                continue;
            }
            String[] dcStringArray = splitToString(input);
            addToDcDic(dcStringArray);
        }
    }

    private static List<Map.Entry<String, Integer>> sortDcDic() {
        List<Map.Entry<String, Integer>> toListMap = new ArrayList<>(dcDic.entrySet());
        toListMap.sort(Comparator.comparing(Map.Entry::getKey));
        return toListMap;
    }

    private static void addToDcDic(String[] dcStringArray) {
        for (String now : dcStringArray) {
            if (dcDic.containsKey(now)) {
                dcDic.put(now, dcDic.get(now) + 1);
            } else {
                dcDic.put(now, 1);
            }
        }
    }

    private static String[] splitToString(String input) {
        input = input.replaceAll("[?!.,:*]", "");
        return input.split("\\s+");
    }

}
