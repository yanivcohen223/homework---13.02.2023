package org.example;

import com.google.gson.Gson;

public class Car {

    public  String model;
    public  String brand;
    public  String color;
    public  int price;
    public  float speed;

    /*public Car (String model,String brand,String color,int price,float speed) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }*/

    public Car (String model,String brand,String color,float speed) {
        this(model,brand,color,50000,speed);
    }

    public Car (String model,String brand,String color) {
        this(model,brand,color,50000,0);
    }

    public Car (String model,String brand,String color,int price,float speed) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.setPrice(price);
        this.setSpeed(speed);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if (speed >= 0 ) {
            this.speed = speed;
        }
        else {
            throw new IllegalArgumentException("Illegal speed");
        }
    }

    @Override
    public String toString() {
        Gson gson = new Gson();

        String json = gson.toJson(this);

        return String.format("%s %s", this.getClass(), json);
    }
}
