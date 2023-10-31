package programme_20_pool_area;

/**
 * Write a class with the name Rectangle
 */
public class Rectangle {
    double width; // instance variable
    double length; // instance variables

    //constructor with parameter width and length
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
        if (width < 0)
            width = 0;
        if (length < 0) ;
        length = 0;
    }

    public double getWidth() {
        // Method named getWidth without any parameters,
        return width;
    }

    public double getLength() {
        //Method named getLength without any parameters,
        return length;
    }

    public double getArea() {
        //Method named getArea without any parameters
        double area = (width * length);
        return area;
    }
}


