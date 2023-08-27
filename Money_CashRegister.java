package Problem_19;

public class Money_CashRegister {
    private double purchase;
    private double payment;
    public Money_CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    public void receivePayment(int coinCount, Money_Coin coinType)
    {
        payment = payment + coinCount * coinType.getCoinValue();
    }

    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }



}
