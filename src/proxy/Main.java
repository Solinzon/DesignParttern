package proxy;

import org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class clazz = car.getClass();

        /**
         * 参数：
         * loader 类加载器
         * interfaces 实现的接口
         * h InvocationHandler
         *
         * 返回代理对象
         */
        IMoveable iMoveable = (IMoveable) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),h);

        iMoveable.move();


        Plane plane = new Plane();
        InvocationHandler handler = new TimeHandler(plane);
        Class planeClazz = plane.getClass();
        IFly iFly = (IFly) Proxy.newProxyInstance(planeClazz.getClassLoader(),planeClazz.getInterfaces(),handler);
        iFly.fly();
    }
}
