package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Observed observed = new Observed1();
        observed.addObserver(new Observer1());
        observed.addObserver(new Observer2());
        observed.notifyObserver();
    }
}

abstract class Observed {
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer 观察者
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();

}

class Observed1 extends Observed {
    @Override
    public void notifyObserver() {
        System.out.println("Target has been changed! Hold your fire!");

        observers.forEach(Observer::response);
    }
}

interface Observer {
    void response();
}

class Observer1 implements Observer {
    @Override
    public void response() {
        System.out.println("Observer1 got your message!");
    }
}
class Observer2 implements Observer {
    @Override
    public void response() {
        System.out.println("Observer2 got your message!");
    }
}
