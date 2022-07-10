package Oops;

public class ChildAddition extends Addition {

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.add(2,3);
        addition.add(12,34,43);
     double d = addition.add(11.5,45.6);
        System.out.println(d);
    }
}
