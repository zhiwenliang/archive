package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Student student = Student.createStudent(12, "Tom");
    }
}

/**
 * 相当于一个对象是自己的工厂，部分实例获取时可以直接从缓存中获取，不需要重复获取
 * 思考
 */
class Student {
    private static final Map<Integer, Student> CACHE = new HashMap<>();
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Student createStudent(int id, String name) {
        Student student = CACHE.get(id);
        if (student == null) {
            student = new Student(id, name);
            CACHE.put(id, student);
        }
        return student;
    }
}
