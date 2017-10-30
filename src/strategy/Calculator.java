package strategy;

public class Calculator {
    ICalculate mICalculate;
    public void setICalculate(ICalculate iCalculate){
        mICalculate = iCalculate;
    }

    public int calculat(float mile){
        return mICalculate.calculate(mile);
    }
}
