package com.dsa.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listOfStuds = new ArrayList<>();
        listOfStuds.add(new Student(103, "Ramon","RajajiNagar"));
        listOfStuds.add(new Student(102, "Tom","North"));
        listOfStuds.add(new Student(105, "Tom","East"));
        listOfStuds.add(new Student(101, "Harry","East"));

        Collections.sort(listOfStuds);
        listOfStuds.forEach(System.out::println);

        //Separate Class Impl
        Collections.sort(listOfStuds, new AddressComparator());

        // Anonymous Class Impl
        Comparator<Student> addressComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        };
        Collections.sort(listOfStuds, addressComparator);


        //JAVA 8 - comparing()
        Comparator<Student> namesComparator = Comparator.comparing(Student::getName);
        Collections.sort(listOfStuds, namesComparator);

        //JAVA 8 - comparingInt(), comparingFloat() etc
        Comparator<Student> idComparator = Comparator.comparingInt(Student::getId);
        Collections.sort(listOfStuds, idComparator);

        // JAVA 8 - comparing() & thenComparing()
        Comparator<Student> namesAndAddressComparator = Comparator.comparing(Student::getName)
                        .thenComparing(Student::getAddress);
        Collections.sort(listOfStuds, namesAndAddressComparator);
        listOfStuds.forEach(System.out::println);

        // Reverse method 1: o1 > o2 = -1 else 1  --> do this in the compareTo() method in the Object class

        // Reverse method 2: reversed() method
        Comparator<Student> namesComparatorRev = Comparator.comparing(Student::getName).reversed();


        // Difference btn Arrays.sort & Collections.sort
        // Arrays.sort --> sorts an Array | uses Dual-Pivot Quicksort for Primitive Arrays | uses MergeSort for Objects
        // Collections.sort --> sorts a List | internally uses Arrays.sort implementation


    }
}
