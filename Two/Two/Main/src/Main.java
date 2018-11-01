import static java.lang.System.*;
import java.util.*;

import cn.sd.*;
import cn.net.sdkd.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(in);
		
		ArrayList<Teacher> T = new ArrayList<Teacher>();
		int age, no;
		String name, sem;
		for(int i = 0;i < 3; ++i) {
			no = cin.nextInt();
			age = cin.nextInt();
			name = cin.next();
			sem = cin.next();
			T.add(new Teacher(no, age, name, sem));
		}
		T.add(new Teacher(0, 1000, "ADMIN", "QWERTY"));
		
		for(Teacher now : T) {
			out.println(now.toString());
		}
		out.println("Output the origin End\n================");
		
		Collections.sort(T, new Comparator<Teacher>() {
			public int compare(Teacher o1, Teacher o2) {
				if(o1.getNo() > o2.getNo()) {
					return 1;
				}
				else if(o1.getNo() < o2.getNo()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		
		for(int i = 0;i < T.size(); ++i) {
			out.println(T.get(i).toString());
		}
		out.println("Output the sorted End\n================");
		
		if(TeacherManagement.search(T, T.size(), 0, 1000, "ADMIN", "QWERTY")) {
			out.println("Yes");
		}
		else {
			out.println("NO");
		}
		
		cin.close();
	}

}
