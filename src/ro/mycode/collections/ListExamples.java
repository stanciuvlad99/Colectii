package ro.mycode.collections;

import ro.mycode.comparators.ComparePersonByAge;
import ro.mycode.models.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {


    public static void examplesIterableIterator(){

        List<Person> people= new ArrayList<>();
        Person person = new Person(1,"Ionut Alexandrescu", 29, "Satu Mare");
        Person person1 = new Person(2,"Maria Antonescu", 31, "Transilvania");
        Person person2 = new Person(3, "Alin Mihai", 25,"Bucuresti");
        people.add(person);
        people.add(person1);
        people.add(person2);

        ComparePersonByAge comparePersonByAge = new ComparePersonByAge();
        comparePersonByAge.compare(person1,person2);


        Iterator<Person> iterator=people.iterator();

        while (iterator.hasNext()){

            Person person3=iterator.next();

            System.out.println(person3);

        }


    }
}
