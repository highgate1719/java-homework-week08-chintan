package programme_20_pool_area;

/**
 * Write a class with the name Cuboid that extends Rectangle class
 */
public class Cuboid extends Rectangle {
    double height; // instance variable


    //constructor with three parameters
    // width, length, and height all of type double.
    // It needs to call the parent constructor and initialize a height field.
    Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;

        // In case the height parameter is less than 0
        // it needs to set the height field value to 0.
        if (height < 0)
            height = 0;
    }

    public double getHeight() { // method without any parameters
        return height;
    }

    public double getVolume() { // method without any parameters
        double sum = (getArea() * height);
        return sum;
    }

}
