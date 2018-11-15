import java.util.*;

/**
 * @author Fancyking
 */
public class Main {
    private static Scanner cin = new Scanner(System.in);

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void main(String[] args) {
        Map<Integer, Integer> dic = new HashMap<>(16);
        dic.put(4, 78);
        dic.put(6, 90);
        dic.put(7, 67);
        dic.put(8, 81);
        dic.put(9, 54);

        ArrayList<Map.Entry<Integer, Integer>> alDic = new ArrayList<>(dic.entrySet());
        alDic.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @SuppressWarnings("ComparatorMethodParameterNotUsed")
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() >= o2.getValue()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

        for (Map.Entry now : alDic) {
            System.out.println(now.getKey());
        }

        int hight = highestScore(alDic);
        System.out.println(hight);
        double avr = averageScore(alDic);
        System.out.println(avr);
    }

    private static double averageScore(ArrayList<Map.Entry<Integer, Integer>> alDic) {
        Integer ans = 0;
        for (Map.Entry now : alDic) {
            ans += (Integer) now.getValue();
        }
        return (double) ans / (double) alDic.size();
    }

    private static int highestScore(ArrayList<Map.Entry<Integer, Integer>> alDic) {
        int ans = -1;
        for (Map.Entry now : alDic) {
            ans = Math.max(ans, (Integer) now.getValue());
        }
        return ans;
    }
}
