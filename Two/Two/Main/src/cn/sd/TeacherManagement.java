package cn.sd;
import cn.net.sdkd.Teacher;

import java.util.ArrayList;

public class TeacherManagement {
	
	// �ṩ�������������ڴ������֪Ϊ Teacher �� ArrayList �ڡ�Ѱ�ҽ�ʦ������ȫ��ȵ��ˣ��ɹ����� true
	public static boolean search(ArrayList<Teacher> tcr, int size, int no, int age, String name, String sem) {
		for(int i = 0;i < size; ++i) {
			if(tcr.get(i).isSame(no, age, name, sem) == true) {
				return true;
			}
		}
		return false;
	}
	
}
