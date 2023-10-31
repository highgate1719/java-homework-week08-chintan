package programme_26_encapsulation;


public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

// Displaying values of the variables
        System.out.println("Prime's Name :" + obj.getName());
        System.out.println("Prime's Age : " + obj.getAge());
        System.out.println("Prime's Roll No : " + obj.getRollNo());
        //Direct access of rollNo is not possible due to encapsulation
        //System.out.println("Prime's rollNo : " + obj.geekName);

    }
}

