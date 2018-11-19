import java.util.*;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static Random rand = new Random(2047);

    public static void main(String[] args) {
        Set<Integer> randomNumber = new HashSet<>(16);
        int wantNumberCount = 7;
        while (randomNumber.size() < wantNumberCount) {
            randomNumber.add(rand.nextInt(30));
        }
//  随机生成数检查,测试环境使用
//        for (int now : randomNumber) {
//            System.out.println(now);
//        }

        List<Integer> userInputNumber = new ArrayList<>(16);
        int shotCount = 0;
        for (int i = 0; i < wantNumberCount; ++i) {
            userInputNumber.add(cin.nextInt());
            if (randomNumber.contains(userInputNumber.get(i))) {
                ++shotCount;
            }
        }

        String outputInfo;
        switch (shotCount) {
            case 7:
                outputInfo = "First";
                break;
            case 6:
                outputInfo = "Second";
                break;
            case 5:
                outputInfo = "Third";
                break;
            default:
                outputInfo = "No Medal";
                break;
        }
        System.out.println(outputInfo);
    }
}
