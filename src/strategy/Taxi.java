package strategy;

public class Taxi implements ICalculate {
    @Override
    public int calculate(float mileage) {
        int price = 0;
        if (mileage < 3){
            price = 10;
        }else {
            price = (int) (Math.ceil(mileage-3) + 10);
        }
        return price;
    }
}
