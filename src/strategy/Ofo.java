package strategy;

public class Ofo implements ICalculate {
    @Override
    public int calculate(float mileage) {

        return (int) Math.ceil(0.04 * mileage);
    }
}
