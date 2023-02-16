package org.example;

import java.util.ArrayList;

public class Main {
    public static int sumPrice(Car car1, Car car2){
        return car1.price + car2.price;
    }

    public static Car higherSpeed(Car car1, Car car2){
        if (car1.speed > car2.speed){
            return car1;
        }
        else {
            return car2;
        }
    }

    public static Car newCar(String model, String brand, String color){
        int randPrice = (int) Math.floor(Math.random()*1000000)+1;
        float randSpeed = (float) Math.floor(Math.random()*250)+1;
        return new Car(model, brand,color,randPrice,randSpeed);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("A3", "BMW","black",80000,180.5f);
        Car car2 = new Car("Sonic", "Chevy","white",50000,120.5f);
        Car car3 = newCar("mustang","ford", "blue");

        System.out.println(sumPrice(car1, car2));
        System.out.println(higherSpeed(car1, car2));
        System.out.println(car3);

        ArrayList<Car> Car_catalog = new ArrayList<>();
        Car_catalog.add(car1);
        Car_catalog.add(car2);
        Car_catalog.add(car3);

        System.out.println(Car_catalog);

        Car_catalog.add(2, newCar("fluence", "renault", "black"));

        System.out.println(Car_catalog);

        int randCar = (int) Math.floor(Math.random()*4)+1;
        Car_catalog.remove(randCar);

        System.out.println(Car_catalog);

        for (Car CarI: Car_catalog) {
            System.out.format("The price of %s is %d \n",CarI.model,CarI.price);
        }
    }
}