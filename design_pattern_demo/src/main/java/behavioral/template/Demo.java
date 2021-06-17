package behavioral.template;

public class Demo {
    public static void main(String[] args) {
        Template target1 = new Concrete1();
        target1.step1();
        target1.step2();

        Template target2 = new Concrete2();
        target2.step1();
        target2.step2();

    }
}

abstract class Template {
    public void step1(){
        System.out.println("first step");
    }
    public abstract void step2();
}

class Concrete1 extends Template {
    @Override
    public void step2() {
        System.out.println("second step");
    }
}
class Concrete2 extends Template {
    @Override
    public void step2() {
        System.out.println("第二步");
    }
}
