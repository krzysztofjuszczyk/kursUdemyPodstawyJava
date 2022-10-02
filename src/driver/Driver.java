package driver;
class Car {
    public static int number = 1;
    static {
        number = 2;
    }
    public static void start() {
        System.out.println("start");
    }
}

public class Driver {
    public static void main(String[] args) {
        Car.start();
        new Car().start();
        System.out.println(Car.number);
    }
}
