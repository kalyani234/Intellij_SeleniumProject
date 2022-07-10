package Oops;

//method overloading = same method name with different parameters
public class Addition {
//polymorphism one thing define in multiple ways

    //methods overloading -- 1. same method with different parameters 2. same parameters with different return type
    //it is also called compile time polymorphism and static polymorphism

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of 2 values is:" + c);
    }

    public void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Addition of 3 values is:" + d);
    }
//same parameters but different return type
    public double add(double a, double b) {
        double c = a + b;
        return c;
    }
}
