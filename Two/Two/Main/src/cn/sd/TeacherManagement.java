package cn.sd;
import cn.net.sdkd.Teacher;

import java.util.ArrayList;

public class TeacherManagement {
	
	// 提供方法，功能是在传入的已知为 Teacher 的 ArrayList 内。寻找教师属性完全相等的人，成功返回 true
	public static boolean search(ArrayList<Teacher> tcr, int size, int no, int age, String name, String sem) {
		for(int i = 0;i < size; ++i) {
			if(tcr.get(i).isSame(no, age, name, sem) == true) {
				return true;
			}
		}
		return false;
	}
	
}
