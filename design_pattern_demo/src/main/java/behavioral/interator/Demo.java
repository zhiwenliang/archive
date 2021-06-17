package behavioral.interator;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Aggregate aggregate = new concreteAggregate();
        aggregate.add("first");
        aggregate.add("second");
        aggregate.add("third");
        MyIterator iterator = aggregate.getIterator();
        System.out.println(iterator.first().toString());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}

interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    MyIterator getIterator();
}

class concreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public MyIterator getIterator() {
        return new ConcreteIterator(list);
    }

}

interface MyIterator {
    Object first();

    Object next();

    boolean hasNext();
}

class ConcreteIterator implements MyIterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < (list.size() - 1);
    }
}