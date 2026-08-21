//1. [Easy] Create a class Student with name, id, and GPA. 
//   Add a constructor and a method displayInfo().
package FinalTrainOOP;

public class student extends Person {
	private String name;
	private int id;
	private float GPA;
	public student() {	
	}
	public student(String name,int id,float GPA) {
		this.name=name;
		this.id=id;
		this.GPA=GPA;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public float getGPA() {
		return GPA;
	}
	public void setGPA(float GPA) {
		this.GPA=GPA;
	}
	public void displayInfo() {
		System.out.println("name : "+name);
		System.out.println("id :   "+id);
		System.out.println("GPA :  "+GPA);
	}
	//5. [Medium] Create an inheritance hierarchy: Person -> Student and Professor. Override a
	//method getRole().
	 @Override
	    public String getRole() {
	        return "I am a student";
	    }
}
