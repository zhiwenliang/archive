package structural.facade;

public class Demo {
    String id = "1";
    String name = "Tom";
    String result = new Facade().window(id, name);
}

class A {
    public String method1(String id) {
        return id;
    }
}

class B {
    public String method2(String name) {
        return name;
    }
}

/**
 * 相当于封装了具体操作过程。
 */
class Facade {
    private A a;
    private B b;

    public String window(String id, String name) {
        return a.method1(id) + "-" + b.method2(name);
    }
}
