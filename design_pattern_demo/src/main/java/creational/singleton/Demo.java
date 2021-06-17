package creational.singleton;

public class Demo {
    Singleton singleton = Singleton.getSingleton();
}

class Singleton{
    /**
    * 使用static和final关键字，保证全局唯一性
    */
    private static final Singleton singleton = new Singleton();

    /**
     * private修饰构造器，让外部类无法实例化Singleton实例。
     */
    private Singleton() {}

     /**
     * 提供给外部获取Singleton实例的方法。
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}
