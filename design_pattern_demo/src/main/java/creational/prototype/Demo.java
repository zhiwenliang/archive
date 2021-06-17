package creational.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object1 object1 = new Object1(1, "name");
        Object1 copy = object1.clone();
    }
}


/**
 * 通过拷贝原对象来创建新对象
 */
class Object1 implements Cloneable {
    private int id;
    private String name;

    public Object1() {
    }

    public Object1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object1 clone() throws CloneNotSupportedException {
        Object1 clone = (Object1) super.clone();
        clone.id = this.id;
        clone.name = this.name;
        return clone;
    }
}
