package lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Person,Student> function = person ->{
            if (person.getAge()<17 || person.getAge()>40)
                throw new IllegalArgumentException("A person younger 17th years old or older 40th years old can't be student.");
            if (person.getYearBirth()<1995)
            return   new Student(person.getFio(), person.getAge(), Group.GROUP1);
            else return new Student(person.getFio(), person.getAge(), Group.GROUP2);
        };

        Person person = new Person("Markov Igor",39,1982);

       Student student1 = function.apply(person);
       System.out.println(student1.getFio() + " " + student1.getAge() + " " + student1.getGroup());

       Person person1 = new Person("Vasina Olga Vladimirovna", 21,2000);
       Student student2 = function.apply(person1);
        System.out.println(student2.getFio() + " " + student2.getAge() + " " + student2.getGroup());

        Person person2 = new Person("Hachatryan Vadim Arsenovich", 41,1981);
       try {
        Student student3= function.apply(person2);
        System.out.println(student3.getFio() + " " + student3.getAge() + " " + student3.getGroup());
       }catch (IllegalArgumentException exception)
       {
           System.out.println(person2.getFio() + " The person over the age of 40");
       }

        Person person3 = new Person("Теплякова Алиса Евгеньевна", 9,2012);
        try {
            Student student4= function.apply(person3);
            System.out.println(student4.getFio() + " " + student4.getAge() + " " + student4.getGroup());
        }catch (IllegalArgumentException exception)
        {
            System.out.println(person3.getFio() + " The person under the age of 17");
        }

    }
}
