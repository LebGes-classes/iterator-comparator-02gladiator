package com.iterator_comparator;

public class Student implements Collection{



    private String name;
    private String[] subjects;


    public Student(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public Iterator getIterator() {
        return new SubjectsIterator();
    }

    private class SubjectsIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < subjects.length ){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return subjects[index++ ];
        }
    }


}
