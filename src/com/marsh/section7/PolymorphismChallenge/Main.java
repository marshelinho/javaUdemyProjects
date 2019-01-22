package com.marsh.section7.PolymorphismChallenge;

class Car {

    private String name;
    private int doors;
    private int wheels;
    private boolean engine;

    public Car(String name, int doors) {
        this.name = name;
        this.doors = doors;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Engine is turned on";
    }

    public String accelerate() {
        return "car is accelerating";
    }

    public String brake() {
        return "car is breaking";
    }
}

class Ford extends Car {
    public Ford(String name, int doors) {
        super(name, doors);
    }


    @Override
    public String startEngine() {
        return "Ford Engine on";
    }

    @Override
    public String accelerate() {
        return "Ford accelerates";
    }

    @Override
    public String brake() {
        return "Ford brakes";
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("1000", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford  = new Ford("fiesta", 4);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
