package com.surabhi.interfaces;

public class Main  {
    public static void main(String[] args) {
//        Car car= new Car();
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia=new Car();
//        carMedia.stop();//this is stopping engine not brake hence we make seperate classes

        NiceCar car= new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();
    }
}
