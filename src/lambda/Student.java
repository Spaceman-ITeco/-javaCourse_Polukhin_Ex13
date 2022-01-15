package lambda;

public class Student {


    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        return group;
    }

    private String fio;
    private int age;
    private final Group group;

    public Student(String fio, int age, Group group) {
        this.fio = fio;
        this.age = age;
        this.group = group;
    }
}
