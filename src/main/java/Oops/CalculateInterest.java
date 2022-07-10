package Oops;

public class CalculateInterest {

    public static void main(String[] args) {

        AmericanExpress ae =new AmericanExpress();
        BankofAmerica ba = new BankofAmerica();
        ICICIBank ic = new ICICIBank();
        System.out.println(ae.getInterest());
        System.out.println(ba.getInterest());
        System.out.println(ic.getInterest());
    }
}
