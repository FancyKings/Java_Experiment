import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

interface IntegerStack {

    public Integer push(Integer item);

    public Integer pop();

    public Integer peek();

    public boolean empty();

    public int size();

}

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        int allNum, printCount, sizeDic, eachNumber;

        sizeDic = cin.nextInt();
        allNum = cin.nextInt();

        ArrayIntegerStack stack = new ArrayIntegerStack(sizeDic);
        for (int i = 0; i < allNum; ++i) {
            eachNumber = cin.nextInt();
            out.println(stack.push(eachNumber));
        }
        printStatus(stack);
        out.println(stack.toString());

        printCount = cin.nextInt();
        for (int i = 0; i < printCount; ++i) {
            out.println(stack.pop());
        }
        printStatus(stack);
        out.println(stack.toString());
    }

    private static void printStatus(ArrayIntegerStack stack) {
        out.println(stack.peek() + "," + stack.empty() + "," + stack.size());
    }

}

class ArrayIntegerStack implements IntegerStack {

    private Integer[] dic;
    private int count;
    private int nowPos = 0;

    ArrayIntegerStack(int count) {
        this.count = count;
        dic = new Integer[count];
    }

    @Override
    public Integer push(Integer item) {
        if (item == null) {
            return null;
        } else if (nowPos == count) {
            return null;
        } else {
            dic[nowPos] = item;
            nowPos++;
            return item;
        }
    }

    @Override
    public Integer pop() {
        if (nowPos == 0) {
            return null;
        }
        nowPos--;
        return dic[nowPos];
    }

    @Override
    public Integer peek() {
        if (nowPos == 0) {
            return null;
        } else {
            return dic[nowPos - 1];
        }
    }

    @Override
    public boolean empty() {
        return nowPos == 0;
    }

    @Override
    public int size() {
        return nowPos;
    }

    @Override
    public String toString() {
        return Arrays.toString(dic);
    }

}