package com.motorbike;

public class MotorBike {
    int speed;
    String Name;
    public MotorBike(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void start()
    {
        System.out.println(getName()+" Bike Started");
    }
    void stop()
    {
        System.out.println(getName()+" Bike Stop");
    }
    void increaseSpeed(int howMuch)
    {
       int speedI=this.speed+howMuch;
        System.out.println("Speed of bike increased by "+howMuch+" now Speed is "+speedI);
    }
    void decreaseSpeed(int howMuch)
    {
        int speedI=this.speed-howMuch;
        System.out.println("Speed of bike decreased by "+howMuch+" now Speed is "+speedI);
    }


}
