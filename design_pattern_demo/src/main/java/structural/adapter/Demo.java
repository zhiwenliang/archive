package structural.adapter;

public class Demo {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void method1() {

            }
        };
        B b = new B() {
            @Override
            public void method2() {

            }
        };
        test(a);
        // 把B接口转换为A接口
        test(new Adapter(b));
    }

    static void test(A a) {
    }
}

interface A {
    void method1();
}


interface B {
    void method2();
}

// B接口到A接口的适配器
class Adapter implements A {
    private B b;

    Adapter(B b) {
        this.b = b;
    }

    @Override
    public void method1() {
        b.method2();
    }
}
