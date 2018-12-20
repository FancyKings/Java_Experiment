import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Fancyking
 */
public class Main {

    private final static String END = "!!!!!";
    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static Map<String, Integer> dic = new HashMap<>(16);

    public static void main(String[] args) {
        readIn();

        List<Map.Entry<String, Integer>> ansList = sortMap();

        printOut(ansList);
    }

    private static List<Map.Entry<String, Integer>> sortMap() {
        List<Map.Entry<String, Integer>> mapToList = new ArrayList<>(dic.entrySet());
        mapToList.sort((o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            } else {
                return o2.getValue() - o1.getValue();
            }
        });
        return mapToList;
    }

    private static void printOut(List<Map.Entry<String, Integer>> ansList) {
        out.println(dic.size());
        int count = 0;

        for (Map.Entry<String, Integer> now : ansList) {
            out.println(now.getKey() + "=" + now.getValue());
            if (++count == 10) {
                break;
            }
        }
    }

    private static void readIn() {
        String cinLine;
        while (cin.hasNextLine()) {
            cinLine = cin.nextLine();
            cinLine = cinLine.trim();
            if (END.equals(cinLine)) {
                break;
            } else if (!"".equals(cinLine)) {
                List<String> chk = removeAndSplit(cinLine);
                for (String now : chk) {
                    if ("".equals(now)) {
                        continue;
                    }
                    if (dic.containsKey(now)) {
                        dic.put(now, dic.get(now) + 1);
                    } else {
                        dic.put(now, 1);
                    }
                }
            }
        }
    }

    private static List<String> removeAndSplit(String cinLine) {
        cinLine = cinLine.toLowerCase();
        cinLine = cinLine.replaceAll("[?!.,:*]", "");
        String[] cinLineSplit = cinLine.split("\\s+");
        List<String> cinLineList = new ArrayList<>(16);
        Collections.addAll(cinLineList, cinLineSplit);
        return cinLineList;
    }

}
