package ra;

import java.util.Map;

public class Student {
    String name;
    int age;

    public Student() {
    }
    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Map.Entry<String, Integer> entry) {
        this.name = entry.getKey();
        this.age = entry.getValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}
