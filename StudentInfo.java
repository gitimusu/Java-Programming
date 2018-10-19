
public class StudentInfo {
	private String name;
	private String id;
	public StudentInfo(){
		name = "no name";
		id = "no id";
	}
	public StudentInfo(String n, String d){
		this.name  = n;
		this.id = d;
	}
	public void setName(String isname){
		this.name = isname;
	}
	public String getName(){
		return name;
	}
	public void setId(String ID){
		this.id = ID;
	}
	public String getId(){
		return id;
	}
	public void display(){
		System.out.println("Student Name: " +name);
		System.out.println("Student ID: " +id);
	}
}
