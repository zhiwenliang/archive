package structural.bridge;

/**
 * 生成新抽出部分的实例后，将新实例部分可以组合到原来的实例中。这种方法过于复杂，并且在某些场景下具有一定的缺陷，并不常见。
 */
public class Demo {
    public static void main(String[] args) {
        NewPart newPart1 = new NewPart1();
        NewPart newPart2 = new NewPart2();
        Bridge result1 = new OldPart1(newPart1);
        Bridge result2 = new OldPart2(newPart2);
    }
}

/**
 * 将原来的一部分抽象为接口
 */
interface NewPart {
    void method1();
}

class NewPart1 implements NewPart {
    @Override
    public void method1() {}
}
class NewPart2 implements NewPart {
    @Override
    public void method1() {}
}


/**
 * 这里相当于桥接模式里的桥，组合新旧部分。
 */
abstract class Bridge {
    protected NewPart newPart;

    public Bridge(NewPart newPart) {
        this.newPart = newPart;
    }

    public abstract void bridgeMethod();
}

/**
 * 抽象出新部分后剩余的旧部分
 */
abstract class OldPart extends Bridge {

    public OldPart(NewPart newPart) {
        super(newPart);
    }

    @Override
    public void bridgeMethod() {}

    public abstract void oldMethod();
}

class OldPart1 extends OldPart {

    public OldPart1(NewPart newPart) {
        super(newPart);
    }

    @Override
    public void oldMethod() {}
}
class OldPart2 extends OldPart {

    public OldPart2(NewPart newPart) {
        super(newPart);
    }

    @Override
    public void oldMethod() {}
}






