package creational.abstractfactory;

public class Demo {
    /**
     * 使用抽象的工厂接口创建工厂实例，相比工厂模式的区别就是工厂实例的创建变成了抽象接口，相当于对工厂进行了标准化。
     */
    AbstractFactory factoryA = new FactoryA();
    Product1 product1A = factoryA.getP1();
    Product2 product2A = factoryA.getP2();

    AbstractFactory factoryB = new FactoryB();
    Product1 product1B = factoryB.getP1();
    Product2 product2B = factoryB.getP2();
}

interface Product1{}
interface Product2{}
class Product1A implements Product1{}
class Product1B implements Product1{}
class Product2A implements Product2{}
class Product2B implements Product2{}

/**
 * 抽象工厂，为所有的工厂提供了抽象化的标准接口。
 */
interface AbstractFactory {
    Product1 getP1();
    Product2 getP2();
}

class FactoryA implements AbstractFactory {
    @Override
    public Product1 getP1() {
        return new Product1A();
    }
    @Override
    public Product2 getP2() {
        return new Product2A();
    }
}
class FactoryB implements AbstractFactory {
    @Override
    public Product1 getP1() {
        return new Product1B();
    }
    @Override
    public Product2 getP2() {
        return new Product2B();
    }
}






