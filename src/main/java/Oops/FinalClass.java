package Oops;

public class FinalClass {

    //Final variable cant change
    //Final class cannot be interited


    final int maxAge=10;

    public void Cal(){
//        maxAge=20; Cant  change final variable
        System.out.println(maxAge);
    }

    public static void main(String[] args) {
        FinalClass fc=new FinalClass();
        fc.Cal();
    }
}
