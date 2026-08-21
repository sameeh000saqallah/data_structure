//9. [Hard] Create a system using composition where a University contains Department objects
//and each Department contains Course objects.
package FinalTrainOOP;
import java.util.ArrayList;

class University {

    private String universityName;
    private ArrayList<Department> departments;
    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayDepartment();
            System.out.println();
        }
    }
}