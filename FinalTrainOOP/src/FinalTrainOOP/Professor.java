//5. [Medium] Create an inheritance hierarchy: Person -> Student and Professor. Override a
//method getRole().
package FinalTrainOOP;

class Professor extends Person {

    @Override
    public String getRole() {
        return "I am a professor";
    }
}