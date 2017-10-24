package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Random;

public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return 方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        method.invoke(target);
        Thread.sleep((new Random().nextInt(1000)));
        long endTime = System.currentTimeMillis();
        System.out.println("行驶的时间是："+ (endTime - startTime));
        return null;
    }
}
