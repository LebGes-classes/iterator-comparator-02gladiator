package com.iterator_comparator;

import java.util.Comparator;

public class SortByYear implements Comparator<Car_Comparator> {
    @Override
    public int compare(Car_Comparator car1, Car_Comparator car2) {
        if (car1.getYear() == car2.getYear()) {
            return 0;
        }
        if (car1.getYear() < car2.getYear()) {
            return 1;
        }
        return -1;

    }
}
