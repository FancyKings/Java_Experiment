import java.util.Scanner;

/**
 * 又是一个没看明白要干啥的，这些函数题目想干啥？
 *
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resource resource = null;
        try {
            resource = new Resource();
            resource.open(sc.nextLine());
            /*这里放置你的答案*/
            sc.close();

        } catch (RuntimeException e) {

        }
        /*代码结束部分*/

    }

}
