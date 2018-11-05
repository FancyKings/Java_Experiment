import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String in;
        int big_char, small_char, not_char;
        while (cin.hasNextLine()) {
            big_char = small_char = not_char = 0;
            in = cin.nextLine();
            int len = in.length();
            for (int i = 0; i < len; ++i) {
                char now = in.charAt(i);
                if (now >= 'a' && now <= 'z') {
                    ++small_char;
                }
                else if (now >= 'A' && now <= 'Z') {
                    ++big_char;
                }
                else {
                    ++not_char;
                }
            }
            System.out.printf("Big: %d\nSmall: %d\nNotCha: %d\n", big_char, small_char, not_char);
        }
    }
}
