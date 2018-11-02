import static java.lang.System.*;

import java.util.*;

public class Main {

    /**
     * 使用快速排序递归进行，需要传入数组，起始排序位置，终止排序位置
     *
     * @param dic 需要排序的数组
     * @param head 数组排序的起始位置
     * @param tail 数组排序的终结位置
     */
    @SuppressWarnings("JavaDoc")
    private static void sort(int[] dic, int head, int tail) {
        if (tail < head) {
            return;
        }
        int save = dic[head], i = head, j = tail, temp;
        while (i != j) {
            while (save <= dic[j] && i < j) {
                --j;
            }
            while (dic[i] <= save && i < j) {
                ++i;
            }
            if (i < j) {
                temp = dic[i];
                dic[i] = dic[j];
                dic[j] = temp;
            }
        }
        dic[head] = dic[i];
        dic[i] = save;
        sort(dic, head, i - 1);
        sort(dic, i + 1, tail);
    }

    /**
     * 递归的折半查找函数,返回数组下标
     *
     * @param dic 数据查找的范围
     * @param head 数据查找范围的起始点
     * @param tail 数据查找范围的终止点
     * @param key 需要查找的数据
     * @return the number idex or -1
     */
    @SuppressWarnings("JavaDoc")
    private static int dfind(int[] dic, int head, int tail, int key) {
        if ((tail == head && dic[head] != key) || (tail < head)) {
            return -1;
        }
        int mid = (head + tail) / 2;
        if (dic[mid] == key) {
            return mid;
        }
        if (key < dic[mid]) {
            return dfind(dic, head, mid - 1, key);
        }
        else {
            return dfind(dic, mid + 1, tail, key);
        }
    }

    /**
     * 非递归的实现折半查找，返回数组下标
     *
     * @param dic 数据查找的范围
     * @param head 数据查找范围的起始点
     * @param tail 数据查找范围的终止点
     * @param key 需要查找的数据
     * @return the number idex or -1
     */
    @SuppressWarnings("JavaDoc")
    private static int wfind(int[] dic, int head, int tail, int key) {
        int mid;
        if (key < dic[head] || key > dic[tail] || head > tail) {
            return -1;
        }
        while (head <= tail) {
            mid = (head + tail) / 2;
            if (dic[mid] < key) {
                head = mid + 1;
            }
            else if (dic[mid] != key) {
                tail = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(in);
        int len = cin.nextInt();
        int[] dic = new int[len];
        for (int i = 0; i < len; ++i) {
            dic[i] = cin.nextInt();
        }

        /* 验证排序算法的正确性 */
        sort(dic, 0, len - 1);
        out.println("After sort :");
        for (int i = 0; i < len; ++i) {
            if (i != 0) {
                out.print(" ");
            }
            out.printf("%d", dic[i]);
        }
        out.println();

        /* 验证递归折半查找程序正确性 */
        int q = cin.nextInt();
        int index = dfind(dic, 0, len - 1, q);
        if (0 <= index) {
            out.println(index);
        }
        else {
            out.println("No such number");
        }

        /* 验证非递归折半查找算法正确性 */
        q = cin.nextInt();
        index = wfind(dic, 0, len - 1, q);
        if (0 <= index) {
            out.println(index);
        }
        else {
            out.println("No such number");
        }
    }
}
