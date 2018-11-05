import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        String[] dic = new String[num];
        for (int i = 0; i < num; ++i) {
            dic[i] = cin.next();
        }
        int how = cin.nextInt();
        String[] ans = RandomTeacher.getRandomTeachers(dic, how);
        for (String i : ans) {
            System.out.println(i);
        }
    }
}
