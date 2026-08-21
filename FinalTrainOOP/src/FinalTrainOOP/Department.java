//9. [Hard] Create a system using composition where a University contains Department objects
//and each Department contains Course objects.
package FinalTrainOOP;
import java.util.ArrayList;

class Department {
    private String departmentName;
    private ArrayList<Course> courses;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        courses = new ArrayList<>();
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}