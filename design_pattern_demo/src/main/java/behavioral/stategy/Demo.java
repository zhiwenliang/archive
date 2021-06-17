package behavioral.stategy;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        Strategy strategy1 = new Strategy1();
        Strategy strategy2 = new Strategy2();
        new Context(strategy1).handle();
        new Context(strategy2).handle();
    }
}

class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handle() {
        strategy.realize("the goal");
    }
}

interface Strategy {
    void realize(String goal);
}

class Strategy1 implements Strategy {
    @Override
    public void realize(String goal) {
        System.out.println("use strategy1 to achieve "+ goal);
    }
}
class Strategy2 implements Strategy {
    @Override
    public void realize(String goal) {
        System.out.println("use strategy2 to achieve "+ goal);
    }
}
