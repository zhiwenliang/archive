package behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        Request request = new Request();
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        if (handler1.process(request)) {
            if (handler2.process(request)) {
                if (handler3.process(request)) {
                    System.out.println("request is already handled.");
                }
            }
        }
    }
}

class Request {

}

interface Handler {
    Boolean process(Request request);
}

class Handler1 implements Handler {
    @Override
    public Boolean process(Request request) {
        return true;
    }
}

class Handler2 implements Handler {
    @Override
    public Boolean process(Request request) {
        return true;
    }
}

class Handler3 implements Handler {
    @Override
    public Boolean process(Request request) {
        return true;
    }
}
