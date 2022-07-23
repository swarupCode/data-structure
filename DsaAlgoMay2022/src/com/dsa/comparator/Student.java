package com.dsa.comparator;

public class Student implements Comparable{
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /*@Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Student)o).name);
    }*/

    @Override
    public int compareTo(Object o) {
        return -(this.id - ((Student)o).id);
    }
}
