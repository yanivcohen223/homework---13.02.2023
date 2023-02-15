package example.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("A3", "BMW", "black", 85);
        Car car2 = new Car("fluence", "renault", "cream");
        Car car3 = new Car("Sonic", "Chevy","white",50000,120.5f);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}