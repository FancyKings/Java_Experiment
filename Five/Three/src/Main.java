import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fancyking
 */
public class Main {

    private static Map<String, Double> dishes = new HashMap<>(16);

    /**
     * 修正-》可以正常处理首尾空白符，无效的空格
     * 修正-》可以处理Key不存在的情况，使用Console给出不存在信息和信息出现行数
     */
    public static void main(String[] args) throws IOException {
        String dishesDir = "./dishes.txt";
        String ordersDir = "./orders.txt";
        toReadingDishes(dishesDir);
        ArrayList ansList = toReadingOrders(ordersDir);
        double allMoney = 0;
        for (var now : ansList) {
            System.out.println(now);
            allMoney += (Double) now;
        }
        System.out.println(allMoney);
    }

    private static ArrayList toReadingOrders(String ordersDir) throws IOException {
        File fOrders = new File(String.valueOf(Paths.get(ordersDir)));
        if (!fOrders.exists()) {
            System.out.println("No Orders File");
            return new ArrayList(0);
        }
        BufferedReader fReader = new BufferedReader(new FileReader(fOrders));
        String nowOrder;
        List<Double> ansList = new ArrayList<>(16);
        int nowPeoID = 0;
        while ((nowOrder = fReader.readLine()) != null) {
            nowPeoID++;
            nowOrder = nowOrder.trim();
            if (nowOrder.length() <= 0) {
                continue;
            }
            String[] splitByDish = nowOrder.split(",");
            double nowPeoMoney = 0;
            for (String nowDish : splitByDish) {
                nowDish = nowDish.trim();
                String[] splitByAns = nowDish.split(":");
                if (!dishes.containsKey(splitByAns[0].trim())) {
                    System.out.println("No Dish Name " + splitByAns[0].trim() + "! while calculator People " + nowPeoID);
                    continue;
                }
                double dishMoney = dishes.get(splitByAns[0].trim());
                nowPeoMoney += dishMoney * Double.valueOf(splitByAns[1]);
            }
            ansList.add(nowPeoMoney);
        }
        fReader.close();
        return (ArrayList) ansList;
    }

    private static void toReadingDishes(String dishesDir) throws IOException {
        File fDishes = new File(String.valueOf(Paths.get(dishesDir)));
        if (!fDishes.exists()) {
            System.out.println("No Dishes File");
            return;
        }
        BufferedReader fReader = new BufferedReader(new FileReader(fDishes));
        String now;
        while ((now = fReader.readLine()) != null) {
            now = now.trim();
            String[] splNow = now.split(":");
            dishes.put(splNow[0].trim(), Double.valueOf(splNow[1].trim()));
        }
        fReader.close();
    }
}
