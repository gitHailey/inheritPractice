package ch7.inherit;

public class Motorcycle extends Vehicle{

    void setSpeed(int speed){
        this.speed=speed;
    }

    public void print(){
        System.out.println("child(Motorcycle): "+","+model+" speed:"+speed+" ,"+stop);
    }
}
