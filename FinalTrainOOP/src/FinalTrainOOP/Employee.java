//8. [Hard] Design an interface Payable with calculatePayment(). Implement it in Employee and
//Freelancer classes.
package FinalTrainOOP;

class Employee implements Payable {
    private double monthlySalary;
    public Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePayment() {
        return monthlySalary;
    }
    //10. [Hard] Given several classes, refactor the design to use polymorphism instead of repeated instanceof checks.
    //Explain your solution.
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public void printRole() {
        System.out.println(name + " is an Employee");
    }
}
