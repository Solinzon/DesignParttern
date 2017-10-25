package singleton;

public class Singleton {


    //饿汉式，ClassLoader加载Singleton就会被实例化
//    private Singleton(){}
//    private static final Singleton INSTANCE = new Singleton();
//    public static Singleton getInstance(){
//        return INSTANCE;
//    }

    //懒汉式，调用Singleton的时候才初始化，但是在多线程环境下会存在并发问题，导致多个实例
//    private Singleton(){}
//    private static Singleton INSTANCE = null;
//
//    public static Singleton getINSTANCE() {
//        if (INSTANCE == null){
//            INSTANCE = new Singleton();
//        }
//        return INSTANCE;
//    }


    //懒汉式，调用Singleton的时候才初始化,加了同步锁，解决的并发问题，但是每次调用getINSTANCE都会加锁，消耗资源较大
//    private Singleton(){}
//    private static Singleton INSTANCE = null;
//
//    public static synchronized Singleton getINSTANCE() {
//        if (INSTANCE == null){
//            INSTANCE = new Singleton();
//        }
//        return INSTANCE;
//    }

    //懒汉式，调用Singleton的时候才初始化,DCL(Double Check Lock),双重校验锁，解决了消耗资源的问题,同时为了保证原子操作问题，需要加上volatile关键字
    //（new 一个对象不是原子操作，回氛围三个步骤：1.给对象分配内存空间。2.初始化构造方法。3.将instance对象的引用指向内存空间。
//    private Singleton(){}
//    private static volatile Singleton INSTANCE = null;
//
//    public static  Singleton getINSTANCE() {
//        if (INSTANCE == null){
//            synchronized (Singleton.class){
//                if (INSTANCE == null){
//                    INSTANCE = new Singleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    //懒汉式，采用静态内部类实现，推荐方式.JVM本身机制保证了线程安全问题,Singleton被ClassLoader装载的时候也不会初始化ClassHolder，保证懒加载。
//    private Singleton(){}
//    private static final class ClassHolder{
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    public static Singleton getINSTANCE(){
//        return ClassHolder.INSTANCE;
//    }

}
