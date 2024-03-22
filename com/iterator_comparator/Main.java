package com.iterator_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"Prog","AiSD","Maths"};

        Student student = new Student("Petya",subjects);

        Iterator iterator = student.getIterator();
        System.out.println(student.getName());
        System.out.println("Subjects: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + ' ');
        }

        System.out.println(' ');
        System.out.println();
        List<Car> list1 = new ArrayList<>();

        list1.add(new Car("4",2015));
        list1.add(new Car("3",1999));
        list1.add(new Car("1",1234));
        list1.add(new Car("2",1500));

        list1.sort(Car::compareTo);


        for(Car car: list1){

            System.out.println(car.getModel() + " | " + car.getYear());
        }


        List<Car_Comparator> list2 = new ArrayList<>();

        list2.add(new Car_Comparator("4",2015));
        list2.add(new Car_Comparator("3",1999));
        list2.add(new Car_Comparator("1",1234));
        list2.add(new Car_Comparator("2",1500));

        Collections.sort(list2, new SortByYear());

        System.out.println();
        for(Car_Comparator car_comparator: list2){

            System.out.println(car_comparator.getModel() + " | " + car_comparator.getYear());
        }






    }
}
