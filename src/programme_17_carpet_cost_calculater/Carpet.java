package programme_17_carpet_cost_calculater;
/**
 * Write a class with the name Carpet.
 * The class needs one field (instance variable) with name cost of type double.
 * The class needs to have one constructor with parameter cost of type
 * double and it needs to initialise the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 */
public class Carpet {
    // initializing one instance variable with double type
    double cost;
    // with one parameter constructor
    public Carpet(double cost) {
        // Check if cost is less than 0 and set to 0 if necessary
        if (cost < 0) {// condition declared
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    //getCost Instance method without parameter with return
    public double getCost() {//Method named getCost without any parameters,
        return cost;
    }
}
