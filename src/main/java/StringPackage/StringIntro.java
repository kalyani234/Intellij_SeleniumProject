package StringPackage;

public class StringIntro {
    public static void main(String[] args) {
        String name = "kalyani";
        String name1 ="kalyani";

        //jvm vl creates two different memory location
        String country = new String("United States");
        String country1 = new String("United States");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(country);
        System.out.println(country1);
    }
}
