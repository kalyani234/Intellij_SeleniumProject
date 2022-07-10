package Hierachial;

public class Cat extends Animal{

    static String name1= "tom";

    public static void main(String[] args) {

        Cat  cat = new Cat();
        cat.walk();
        System.out.println("Cat name"+name1);
    }
}

