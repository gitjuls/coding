package dataStructure.doubleLinkedList;

import dataStructure.Employee;

public class Main {
    //good for inserting and removing el in the beginning of the list and in the end, O(1) or O(n)
    //list can grow without resizing and shifting
    public static void main(String[] args) {
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        //System.out.println(list.isEmpty());
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

       // list.printList();
       // System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End" , 78);
        list.addInMid(billEnd,2);
        list.printList();
        System.out.println(list.getSize());
//--------------------------------------------------
       /* list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();*/

       /* list.removeFromMiddle(1);
        System.out.println(list.getSize());
        list.printList();*/

//---------------------------------------------------
        /*list.addInMid(new Employee("Mark", "Middle", 123), 4);
        list.printList();*/
    }
}
