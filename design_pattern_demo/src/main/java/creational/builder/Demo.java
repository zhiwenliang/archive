package creational.builder;

public class Demo {
    Builder builder = new Builder();
    Object1 object1 = new Object1();
    Object1 result = builder.build2(builder.build1(object1));

    /**
     * 还可以像StringBuilder这样进行链式调用。
     */
    StringBuilder stringBuilder = new StringBuilder().append("A").append("B");

}

class Object1 {}

/**
 * 建造者可以通过不同的方法表示构建过程，相当于是多个小型工厂。
 */
class Builder {
    public Object1 build1(Object1 object1) {
        return object1;
    }

    public Object1 build2(Object1 object1) {
        return object1;
    }
}
