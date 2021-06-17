package behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Request request = new Request();
        Command command = new Command1(request);
        command.execute();
    }
}

class Request {

}

interface Command {
    void execute();
}

class Command1 implements Command {

    private Request request;

    public Command1(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {

    }
}
