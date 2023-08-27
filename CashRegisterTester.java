package Problem_2;

public class CashRegisterTester {
    public static void main(String[] args) {
        final Coin DOLLARS = new Coin(1.00 , "Dollars");
        final Coin QUARTER = new Coin(0.25 , "Quarter");
        final Coin NICKLE = new Coin(0.05 , "Nickle");
        final Coin DINE = new Coin(0.10 , "Dine");
        final Coin PENNY = new Coin(0.01 , "Penny");

        CashRegister register = new CashRegister();

        register.recordPurchase(2.19);
        register.recordPurchase(1.96);
        register.recordPurchase(4.91);

        register.receivePayment(40, DOLLARS);

        System.out.printf("Toatal Purchase:  $%5.2f\nTotal Payment:  $%5.2f\nTotal Change:  $%5.2f\n" ,
                register.getTotalPurchase() , register.getTotalPayment() , register.getTotalChange());
        System.out.println("--------------------------------------------------------");
        System.out.printf("Number of Dollars:%3d\n" , register.giveChange(DOLLARS));
        System.out.printf("Number of Quarters:%2d\n" , register.giveChange(QUARTER));
        System.out.printf("Number of Dines:%5d\n" , register.giveChange(DINE));
        System.out.printf("Number of Nickle:%4d\n" , register.giveChange(NICKLE));
        System.out.printf("Number of Penny:%5d\n" , register.giveChange(PENNY));



    }
}
