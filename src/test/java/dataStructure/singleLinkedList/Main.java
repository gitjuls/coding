package dataStructure.singleLinkedList;

import dataStructure.Employee;

public class Main {
    //good for inserting and removing el in the beginning of the list, constant time complexity
    //list can grow without resizing and shifting
    public static void main(String[] args) {
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
//--------------------------------------------------
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
