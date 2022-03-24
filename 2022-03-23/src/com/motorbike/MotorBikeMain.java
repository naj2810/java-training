package com.motorbike;

public class MotorBikeMain {
    public static void main(String args[])
    {
        MotorBike ducati=new MotorBike("ducati");
        ducati.getName();
        ducati.start();
        ducati.setSpeed(25);
        System.out.println("Speed is: "+ducati.getSpeed());
        ducati.increaseSpeed(15);

        ducati.decreaseSpeed(10);

        ducati.stop();
        System.out.println("\n");
        MotorBike honda=new MotorBike("Honda");
        honda.getName();
        honda.start();
        honda.setSpeed(35);
        System.out.println("Speed is: "+honda.getSpeed());
        honda.increaseSpeed(15);

        honda.decreaseSpeed(10);

        honda.stop();

    }
}
