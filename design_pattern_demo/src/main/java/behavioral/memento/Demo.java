package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        // 第一次操作
        Originator originator = new Originator("1");
        Memento memento = originator.createMemento();
        careTaker.push(memento);

        // 第二次操作
        originator = new Originator("2");
        memento = originator.createMemento();
        careTaker.push(memento);

        // 第三次操作
        originator = new Originator("3");
        memento = originator.createMemento();
        careTaker.push(memento);
        // 查看状态
        System.out.println(originator.getState());

        // 恢复到状态2
        careTaker.pop();
        originator.restoreMemento(careTaker.peek());

        System.out.println(originator.getState());
    }

}

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}


/**
 * 利用deque可以模拟栈操作
 */
class CareTaker {
    Deque<Memento> deque = new ArrayDeque<>();

    public void push(Memento memento) {
        deque.push(memento);
    }

    public void pop() {
        deque.pop();
    }

    public Memento peek() {
        return deque.peek();
    }

}

