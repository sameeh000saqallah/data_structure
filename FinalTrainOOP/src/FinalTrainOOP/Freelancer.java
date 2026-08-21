//8. [Hard] Design an interface Payable with calculatePayment(). Implement it in Employee and
//Freelancer classes.
package FinalTrainOOP;

class Freelancer implements Payable {
    private double hoursWorked;
    private double hourlyRate;
    public Freelancer(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }
}