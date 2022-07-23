package com.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        list.print();
        list.printMidElement();
//        list.deleteHead();
        list.print();
        if(list.isValueInList(22)){
            System.out.println("\nValue is present in the list. . .");
        } else {
            System.out.println("\nValue is NOT present in the list. . .");
        }
        list.sortedInsert(6);
        list.sortedInsert(1);
        list.print();


        /////////////////////////////////////////////

        LinkedListImpl<String> list_string = new LinkedListImpl<>();
        list_string.add("Swarup");
        list_string.add("Anusha");
        System.out.println("");
        list_string.print();
        if(list_string.isValueInList("Anushaa")){
            System.out.println("\nValue is present in the list. . .");
        } else {
            System.out.println("\nValue is NOT present in the list. . .");
        }
    }
}
