package FinalTrainOOP;

public class main {
	//2. [Easy] Explain the difference between a class and an object with a Java example?
	//Class → a blueprint/template that defines what an object will have and do.
	//Object → an actual instance created from that class.
	//4. [Easy] Write a Java example that demonstrates method overloading.
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    //10. [Hard] Given several classes, refactor the design to use polymorphism instead of repeated instanceof checks.
    //Explain your solution.
    public static void printRole(Employee employee) {
        if (employee instanceof Manager) {
            System.out.println(employee.name + " is a Manager");
        }
        else if (employee instanceof Developer) {
            System.out.println(employee.name + " is a Developer");
        }
        else if (employee instanceof Designer) {
            System.out.println(employee.name + " is a Designer");
        }
    }
    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        System.out.println(add(2.5, 3.5));
        //6. [Medium] Explain encapsulation, inheritance, polymorphism, and abstraction, and give one
        //Java example for each.
        student s = new student();
        s.setName("Sameeh");
        System.out.println(s.getName());
      //7. [Medium] Create an abstract class Shape with an abstract area() method and subclasses
      //Circle and Rectangle.
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Rectangle Area = " + rectangle.area());
      //8. [Hard] Design an interface Payable with calculatePayment(). Implement it in Employee and
      //Freelancer classes.
        Employee employee = new Employee(3000);
        Freelancer freelancer = new Freelancer(40, 25);
        System.out.println("Employee Payment = " +
                           employee.calculatePayment());
        System.out.println("Freelancer Payment = " +
                           freelancer.calculatePayment());
      //9. [Hard] Create a system using composition where a University contains Department objects
      //and each Department contains Course objects.
        // Create courses
        Course c1 = new Course("Data Structures", "CS201");
        Course c2 = new Course("Object Oriented Programming", "CS202");
        Course c3 = new Course("Database Systems", "CS301");
        Department cs = new Department("Computer Science");
        Department it = new Department("Information Technology");
        cs.addCourse(c1);
        cs.addCourse(c2);
        it.addCourse(c3);
        University university = new University("ABC University");
        university.addDepartment(cs);
        university.addDepartment(it);
        university.displayUniversity();
        //10. [Hard] Given several classes, refactor the design to use polymorphism instead of repeated instanceof checks.
        //Explain your solution.
        Employee e1 = new Manager("Ali");
        Employee e2 = new Developer("Ahmad");
        Employee e3 = new Designer("Sara");
        printRole(e1);
        printRole(e2);
        printRole(e3);
        e1.printRole();
        e2.printRole();
        e3.printRole();
    }
}