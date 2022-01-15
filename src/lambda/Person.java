package lambda;

public class Person  {
    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public Person(String fio, int age, int yearBirth) {
        this.fio = fio;
        this.age = age;
        this.yearBirth = yearBirth;
    }

    private String fio;
    private int age;
    private int yearBirth;


}
