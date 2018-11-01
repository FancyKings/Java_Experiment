package cn.net.sdkd;

public class Teacher {
	private int no, age;
	private String name, sem;
	
	// 定义构造器
	public Teacher(int no, int age, String name, String sem) {
		this.setInfo(no, age, name, sem);
	}
	public Teacher() {};
	
	// 实现类的 set 和  get 方法
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
	// 定义总设置教师属性方法
	public void setInfo(int no, int age, String name, String sem) {
		this.setAge(age);
		this.setNo(no);
		this.setName(name);
		this.setSem(sem);
	}
	
	// 实现类的 equals 方法，用于判断传入对象的 no 是否相等
	public boolean equals(Object cmp) {
		if(cmp instanceof Teacher) { // 类型检查，是否传入的是同一个对象
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
	
	// 重写 toString 方法
	public String toString() {
		return ("ID is : " + this.getNo() + "\nName is : " + this.getName() + "\nAge is : " + this.getAge() + "\nSeminary is : " + this.getSem() + '\n');
	}
	
	// 定义完全比较函数，所有信息相符判断为真
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
