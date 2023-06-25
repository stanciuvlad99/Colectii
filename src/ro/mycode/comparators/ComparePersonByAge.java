package ro.mycode.comparators;

import ro.mycode.models.Person;

import java.util.Comparator;

public class ComparePersonByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getVarsta()>o2.getVarsta()){
            return 1;
        } else if (o1.getVarsta()<o2.getVarsta()) {
            return -1;
        }
        return 0;
    }
}
