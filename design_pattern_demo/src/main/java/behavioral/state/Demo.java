package behavioral.state;

public class Demo {
    public static void main(String[] args) {
        State state1 = new State1();
        Context context = new Context(state1);
        System.out.println(context.toString());
        context.behave("state2");
        System.out.println(context.toString());
        context.behave("state1");
        System.out.println(context.toString());
        context.behave("nothing");
        System.out.println(context.toString());
    }
}

class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void behave(String input) {
        if ("state1".equals(input)){
            new State1().handle(this);
            return;
        }
        if ("state2".equals(input)) {
            new State2().handle(this);
            return;
        }
        System.out.println("nothing change");
    }

    @Override
    public String toString() {
        return "Context{" +
                "state=" + state.getClass().getSimpleName() +
                '}';
    }
}

interface State {
    void handle(Context context);
}

class State1 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("change to state1");
        context.setState(new State1());
    }

}

class State2 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("change to state2");
        context.setState(new State2());
    }
}
