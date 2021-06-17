package structural.decorator;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        A a = new DecoratorImp1(new DecoratorImp2(new Core()));
        a.method();
        InputStream inputStream = new BufferedInputStream(new DataInputStream(new FileInputStream("/")));
    }
}

interface A {
    void method();
}

/**
 * 核心功能类
 */
class Core implements A {
    @Override
    public void method() {

    }

    public void coreMethod() {

    }
}

/**
 * 装饰类的接口，可以将一些相同处理写在这个里面
 */
abstract class Decorator implements A {
    protected A a;

    public Decorator(A a) {
        this.a = a;
    }

    @Override
    public void method() {

    }

}

/**
 * 装饰类接口的实现
 */
class DecoratorImp1 extends Decorator {
    public DecoratorImp1(A a) {
        super(a);
    }

    @Override
    public void method() {

    }

}

class DecoratorImp2 extends Decorator {
    public DecoratorImp2(A a) {
        super(a);
    }

    @Override
    public void method() {

    }

}





