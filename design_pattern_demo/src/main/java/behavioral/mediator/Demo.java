package behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.method1();
        mediator.method2();
    }
}

/**
 * 中介类，封装A,B,C对象之间的交互逻辑
 */
class Mediator {
    private A a;
    private B b;
    private C c;

    /**
     * 交互逻辑1
     */
    public void method1() {
        a.setStatus(0);
        b.setStatus(1);
        c.setStatus(1);
    }

    /**
     * 交互逻辑2
     */
    public void method2() {
        a.setStatus(1);
        b.setStatus(0);
        c.setStatus(1);
    }
}

class A {
    private int status;

    public A(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
class B {
    private int status;

    public B(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
class C {
    private int status;

    public C(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}