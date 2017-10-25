package singleton;
//枚举类实现单例模式，除了具有线程安全和懒加载的优势外，在被序列化或者反序列化的时候也能防止床架新的对象
public enum BestSingleton {
    INSTANCE
}
