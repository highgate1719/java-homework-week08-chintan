package programme_24_methodoverriding;
// Test Class to create objects and call the methods
class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI RATE OF INTEREST : "+s.getRateOfInterest());
        System.out.println("ICICI RATE OF INTEREST : "+i.getRateOfInterest());
        System.out.println("AXIS RATE OF INTEREST : "+a.getRateOfInterest());
    }
}
