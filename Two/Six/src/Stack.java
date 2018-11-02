import java.util.*;

class Stack {

    private int head, max_len;
    private int[] dic;
    /* 使用nullptr 表示栈为空的非法访问 */
    private int nullptr = -0x3f3f3f3f;

    Stack() {
        max_len = 500;
        dic = new int[max_len];
        head = -1;
    }

    /* 判断栈是否为空，返回 true 为空栈 */
    boolean isEmpty() {
        return head < 0;
    }

    /* 元素压入栈 */
    void push(int num) {
        if (head < max_len) {
            dic[++head] = num;
        }
        else {
            max_len += 500;
            int[] new_dic = new int[max_len];
            new_dic = dic.clone();
            dic = new_dic;
        }
    }

    int top() {
        assert !isEmpty() : "Stack is Empty!!!";
        return dic[head];
    }

    int pop() {
        assert !isEmpty() : "Stack is Empty!!!";
        return dic[head--];
    }

}
