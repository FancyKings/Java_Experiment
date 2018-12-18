import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String choice = sc.next();
            try {
                if (choice.equals("number")) {
                    throw new NumberFormatException();
                } else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("number format exception\njava.lang.NumberFormatException");
            } catch (IllegalArgumentException e) {
                System.out.println("illegal argument exception\njava.lang.IllegalArgumentException");
            } catch (Exception e) {
                System.out.println("other exception\njava.lang.Exception");
            }
            /*这里放置你的答案*/
        }//end while
        sc.close();
    }

}
