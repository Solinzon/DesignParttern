package observer;

/**
 * 具体的观察者，市民
 */
public class Citizen implements IObserver{
    String name;


    public Citizen(String name) {
        this.name = name;
    }

    @Override
    public void onUpdate(String weather) {
        System.out.println("我是"+name+"，我收到天气预报了，今天的天气是："+weather);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }


}
