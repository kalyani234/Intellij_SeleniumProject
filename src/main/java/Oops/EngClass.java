package Oops;

public class EngClass implements Student{
    @Override
    public void displayName() {
        System.out.println("Navya");
    }

    @Override
    public void getStudentNumber() {
        System.out.println("456");

    }

    public static void main(String[] args) {
        EngClass ec = new EngClass();
        ec.displayName();
        ec.getStudentNumber();
    }
}
