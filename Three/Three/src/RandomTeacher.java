import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

class RandomTeacher {
    static String[] getRandomTeachers(String[] dic, int n) {
        String[] ans = new String[n];
        Random sand = new Random(1024);
        Set<Integer> src = new LinkedHashSet<>();
        while (src.size() < n) {
            src.add(sand.nextInt(dic.length));
        }
        int now = 0;
        for (int i : src) {
            ans[now++] = dic[i];
        }
        return ans;
    }
}
