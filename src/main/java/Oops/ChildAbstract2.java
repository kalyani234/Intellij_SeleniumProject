package Oops;

public class ChildAbstract2 extends AbstractClass{

    public void displayShape() {
        System.out.println("ChildAbstract2 class");
    }

    public static void main(String[] args) {
        AbstractClass ac= new ChildAbstract();
        AbstractClass ac1 = new ChildAbstract2();
        ac.displayShape();
        ac1.displayShape();
    }
}
