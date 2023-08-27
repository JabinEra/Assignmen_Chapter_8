package Problem_19;

public class Money_Coin {
    private double coinValue;
    private String coinName;

    public Money_Coin(double value , String name){
        coinValue = value;
        coinName = name;
    }

    public double getCoinValue() {
        return coinValue;
    }
    public String getCoinName(){
        return coinName;
    }
}
