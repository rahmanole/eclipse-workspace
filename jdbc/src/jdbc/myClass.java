package jdbc;

public class myClass {
	private String name = "Abul";
	public int age;

	
	static String nameAge(String name,int age) {
		String nameAge = name+" "+age;
		age = 20;
		return nameAge;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}
