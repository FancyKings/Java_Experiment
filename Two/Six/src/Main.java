import static java.lang.System.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(in);
        Stack sk = new Stack();
        int num = cin.nextInt();
        while (num > 0) {
            sk.push(num % 2);
            num /= 2;
        }
        while (!sk.isEmpty()) {
            out.print(sk.pop());
        }
        /*
         * 断言抛出异常测试，运行参数需加入 -ea
         * out.println(sk.pop());
         * */
        out.println();
    }
}
