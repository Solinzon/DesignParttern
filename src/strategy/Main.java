package strategy;

/**
 * 策略模式:不同交通工具有不同的计价方式，都继承了ICalculate接口，根据规则实现各种计价方式
 * 这样减少了在判断交通工具的if-else语句
 */
public class Main {
    public static void main(String[] args) {
        float mileage = 16.4f;
        ICalculate bus = new Bus();
        ICalculate taxi = new Taxi();
        ICalculate ofo = new Ofo();

        Calculator c = new Calculator();
        c.setICalculate(taxi);//只需将对应的交通工具注入到计算类中

        System.out.println("乘的士需要花；"+c.calculat(mileage));

    }
}
