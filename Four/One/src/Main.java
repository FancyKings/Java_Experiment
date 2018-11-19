import java.util.*;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> dic = new HashMap<>(16);
        String userInputChoice, userInputString;
        int userInputMark;
        String infoShow = "Please type Y/y and enter if you want to record information:";
        System.out.println(infoShow);
        while (cin.hasNext()) {
            userInputChoice = cin.next();
            if (!"Y".equals(userInputChoice) && !"y".equals(userInputChoice)) {
                break;
            }
            userInputString = cin.next();
            userInputMark = cin.nextInt();
            dic.put(userInputString, userInputMark);
            System.out.println(infoShow);
        }
        List<Map.Entry<String, Integer>> sortedDic = sort(dic);
        for (Map.Entry<String, Integer> now : sortedDic) {
            System.out.printf(now.getKey() + " %d\n", now.getValue());
        }
    }

    private static List<Map.Entry<String, Integer>> sort(Map<String, Integer> dic) {
        List<Map.Entry<String, Integer>> dicList = new ArrayList<>(dic.entrySet());
        dicList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue() + o2.getValue();
            }
        });
        return dicList;
    }

}
