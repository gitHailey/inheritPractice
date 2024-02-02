package ch7.inherit;

import javax.swing.*;

public class Vehicle {
    String model;
    int speed;
    boolean stop;
    String color;
    int wheelCount;
    boolean onOff;

    public Vehicle(){
        model="Tesla modelX";
        speed=300;
        stop=true;
    }

    public void print(){
        System.out.println("car: "+model+" speed:"+speed+" ,"+stop);
    }
}

//class Car extends Vehicle{
//
//}
//
//class Motorcycle extends Vehicle{
//
//}