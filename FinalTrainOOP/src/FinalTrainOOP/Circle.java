//7. [Medium] Create an abstract class Shape with an abstract area() method and subclasses
//Circle and Rectangle.
package FinalTrainOOP;

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}