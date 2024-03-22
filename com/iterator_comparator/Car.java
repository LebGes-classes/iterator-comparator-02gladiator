package com.iterator_comparator;

public class Car implements Comparable<Car> {

    private String model;
    private int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public int compareTo(Car car) {
        if (year == car.getYear()) {
            return 0;
        }
        if (year < car.getYear()) {
            return -1;
        }
        return 1;
    }
}
