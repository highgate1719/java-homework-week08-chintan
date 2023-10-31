package programme_17_carpet_cost_calculater;

/**
 * Write a class with the name Calculator.
 * The class needs two fields (instance variables) with name floor of type Floor
 * and carpet of type Carpet.
 * The class needs to have one constructor with parameters
 * floor of type Floor and carpet of type Carpet and it needs to initialise the fields.
 * Write the following methods (instance methods):
 * Method named getTotalCost without any parameters, it needs to return
 * the calculated total cost to cover the floor with a carpet.
 */
public class Calculator {

    // two instance variables
    Floor floor;
    Carpet carpet;

    // with two parameter constructor
    public Calculator(Floor floor, Carpet carpet) {
        // initializing the field
        this.floor = floor;
        this.carpet = carpet;
    }

    // getTotalCost Instance method without parameter with return
    public double getTotalCost() {
        double area = floor.getArea();  //Using getArea method from Floor class
        double cost = carpet.getCost(); // using a getCost method from Carpet class
        double totalCost = area * cost;
        return totalCost;
    }


}
