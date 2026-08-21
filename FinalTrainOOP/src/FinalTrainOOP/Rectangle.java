//7. [Medium] Create an abstract class Shape with an abstract area() method and subclasses
//Circle and Rectangle.
package FinalTrainOOP;

class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}