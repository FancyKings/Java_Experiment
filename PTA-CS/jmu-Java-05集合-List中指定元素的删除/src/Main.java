import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list, word);
            System.out.println(list);
        }
        sc.close();
    }

    private static void remove(List<String> list, String word) {
        list.removeIf(s -> s.equals(word));
    }

    private static List<String> convertStringToList(String nextLine) {
        List<String> ansList = new ArrayList<>(16);
        String[] ansString = nextLine.split("\\s+");
        Collections.addAll(ansList, ansString);
        return ansList;
    }

}