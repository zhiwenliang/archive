package behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        Target target = new Target("Tom");
        target.handle(new RealVisitor());

    }
}

interface Visitor {
    void visit(Target target);
}

class Target {
    private String name;
    public String getName() {
        return name;
    }
    public Target(String name) {
        this.name = name;
    }

    public void handle(Visitor visitor){
        visitor.visit(this);
    }
}

class RealVisitor implements Visitor {
    @Override
    public void visit(Target target) {
        System.out.println("visitor got target's name: " + target.getName());
    }
}
