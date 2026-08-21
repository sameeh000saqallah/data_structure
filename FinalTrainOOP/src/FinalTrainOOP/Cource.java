//9. [Hard] Create a system using composition where a University contains Department objects
//and each Department contains Course objects.
package FinalTrainOOP;

class Course {
    private String courseName;
    private String courseCode;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }
}