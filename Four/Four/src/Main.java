import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int humanAge, startPoint, endPoint;
        String humanName;
        startPoint = cin.nextInt();
        endPoint = cin.nextInt();
        BusLine busLine = new BusLine(startPoint, endPoint);
        String endOfInput = "-1";
        while (!cin.hasNext(endOfInput)) {
            humanName = cin.next();
            humanAge = cin.nextInt();
            Human nowInsert = new Human(humanName, humanAge);
            busLine.addHuman(nowInsert);
        }
        busLine.showAll();
    }
}
