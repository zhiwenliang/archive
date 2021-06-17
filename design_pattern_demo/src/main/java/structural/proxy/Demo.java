package structural.proxy;

public class Demo {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void method() {

            }
        };
        method(new Proxy(a));
    }

    static void method(A a) {

    }
}

interface A {
    void method();
}

class Proxy implements A {
    private A a;

    public Proxy(A a) {
        this.a = a;
    }

    @Override
    public void method() {
        a.method();
        method1();
    }

    public void method1() {
    }
}

