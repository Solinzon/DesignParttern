package strategy;

public class Bus implements ICalculate {
    @Override
    public int calculate(float mileage) {
        return 2;
    }
}
