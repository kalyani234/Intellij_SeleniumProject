package Oops;

public class Car {
//super

    //super keyword is a referenced variable which is used to refer immediate parent class object
    //super can be used to refer immediate parent class instance variable.
    //super can be used to invoke immediate parent class method
    //super can be used to invoke parent constructor
    Car(){
        System.out.println("creating const for parent class");
    }

    //final method cannot be inherited by child class

    public final void setWheels(){
        System.out.println("car having 4 wheels");
    }
    String name = "Car";
    public void run(){
        System.out.println("Car is running");
    }
}