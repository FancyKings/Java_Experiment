package cn.net.sdkd;

public class Teacher {
	private int no, age;
	private String name, sem;
	
	// ���幹����
	public Teacher(int no, int age, String name, String sem) {
		this.setInfo(no, age, name, sem);
	}
	public Teacher() {};
	
	// ʵ����� set ��  get ����
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSem(String sem) {
		this.sem = sem;
	}
	
	public String getSem() {
		return this.sem;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getNo() {
		return this.no;
	}
	// ���������ý�ʦ���Է���
	public void setInfo(int no, int age, String name, String sem) {
		this.setAge(age);
		this.setNo(no);
		this.setName(name);
		this.setSem(sem);
	}
	
	// ʵ����� equals �����������жϴ������� no �Ƿ����
	public boolean equals(Object cmp) {
		if(cmp instanceof Teacher) { // ���ͼ�飬�Ƿ������ͬһ������
			Teacher par = (Teacher) cmp;
			if(this.getNo() == par.getNo()) {
				return true;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	// ��д toString ����
	public String toString() {
		return ("ID is : " + this.getNo() + "\nName is : " + this.getName() + "\nAge is : " + this.getAge() + "\nSeminary is : " + this.getSem() + '\n');
	}
	
	// ������ȫ�ȽϺ�����������Ϣ����ж�Ϊ��
	public boolean isSame(int no, int age, String name, String sem) {
		if(this.getName() != name) {
			return false;
		}
		if(this.getNo() != no) {
			return false;
		}
		if(this.getName() != name) {
			return false;
		}
		if(this.getSem() != sem) {
			return false;
		}
		return true;
	}
	
}
