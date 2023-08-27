package Problem_2;

public class CashRegister {

    private double purchase;
    private double payment;

    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount){
        payment = payment + amount;
    }
    public void  receivePayment(int coiCount , Coin coinType){
        payment = payment + (coiCount * coinType.getCoinValue());
    }
    public double getTotalPurchase(){
        return purchase;
    }
    public double getTotalPayment(){
        return payment;
    }
    public double change;
    public double getTotalChange(){
        double change = payment - purchase;
        return  change;
    }
    public int giveChange(Coin coinType){
        double coinValue = coinType.getCoinValue();
        int numbersOfCOin;
        numbersOfCOin = (int) (change / coinValue);
        payment = payment - (coinValue * numbersOfCOin);

        if(coinType.getCoinValue() == 0.01){
            numbersOfCOin ++;
        }
        return numbersOfCOin;
    }


}
