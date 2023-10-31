package programme_20_pool_area;

/**
 * a class with the name Main that contains the main method.
 */
public class Main {
    public static void main(String[] args) {//main method


        Rectangle rectangle = new Rectangle(5, 10); // new object
        System.out.println("Rectangle.width =" + rectangle.getWidth());
        System.out.println("Rectangle.length =" + rectangle.getLength());
        System.out.println("Rectangle.are =" + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);//new object
        System.out.println("Cuboid.width=  " + cuboid.getWidth());
        System.out.println("Cuboid.length" + cuboid.getLength());
        System.out.println("Cuboid.area " + cuboid.getArea());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());

    }
}