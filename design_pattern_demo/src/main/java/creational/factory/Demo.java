package creational.factory;

/**
 * 通过工厂内的方法产生实际的Product实例，而不是直接new一个Product实例，所以创建实例的逻辑就不用暴露给使用者
 */
public class Demo {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Product product = factory.produce();
    }
}

class Product {}

class Factory {
    public Product produce(){
        return new Product();
    }
}
