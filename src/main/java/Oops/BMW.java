package Oops;

public class BMW extends Car{


    String name = "BMW";

    BMW(){
        super();
        System.out.println("Calling BMW construtor");

    }

    //Getting an error setWheels() cant be over riden
//    public void setWheels(){
//
//    }
    public void getName(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void run()
    {
        System.out.println("BMW is running");
        super.run(); //super keyword calling a method
    }
    public static void main(String[] args) {

//        Car car = new Car();
//        System.out.println(name);
//        car.run();

        BMW bmw = new BMW();
        bmw.getName();
        bmw.run();
    }
}