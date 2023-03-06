package org.example.patterns;

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}
class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class Factory {

    public Car create(String typeOfCar) {
        return switch (typeOfCar) {
            case "Toyota" -> new Toyota();
            case "Audi" -> new Audi();
            default -> null;
        };
    }
}
