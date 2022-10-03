package com.dsa.misc;

public class EqualsTest {
    public static void main(String[] args) {
        String name1 = "Tom";
        System.out.println("name1 hashcode: "+name1.getClass().hashCode());
        String name2 = name1;
        System.out.println("name2 hashcode: "+name2.getClass().hashCode());

        String name3 = new String("Ram");
        System.out.println("name3 hashcode: "+name3.getClass().hashCode());

        System.out.println("Equals: == :"+(name1 == name2));
        System.out.println("Equals: .equals() :"+(name1.equals(name2)));
        name1 = "Swarup";
        System.out.println("name1 = "+name1);
        System.out.println("name2 = "+name2);
        System.out.println("name1 hashcode: "+name1.getClass().hashCode());
        System.out.println("name2 hashcode: "+name2.getClass().hashCode());

        System.out.println("Equals: == :"+(name1 == name2));
        System.out.println("Equals: .equals() :"+(name1.equals(name2)));

    }
}
