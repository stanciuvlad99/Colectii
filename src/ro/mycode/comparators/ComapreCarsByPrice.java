package ro.mycode.comparators;

import ro.mycode.models.Car;

import java.util.Comparator;

public class ComapreCarsByPrice implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getAn() > o2.getAn()) {
            return 1;
        } else if (o1.getAn() < o2.getAn()) {
            return -1;
        }
        return 0;
    }
}
