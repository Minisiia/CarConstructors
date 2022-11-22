package car;

public class Main {
    public static void main(String[] args) {
        Car carConDefault = new Car();
        Car carConWithYear = new Car(1999);
        Car carConWithColor = new Car("pink");
        Car carConWithAllParam = new Car(2022,"black");
        System.out.println("carConDefault: "+ carConDefault);
        System.out.println("carConWithYear: " + carConWithYear);
        System.out.println("carConWithColor: " + carConWithColor);
        System.out.println("carConWithAllParam: " + carConWithAllParam);
    }
}
