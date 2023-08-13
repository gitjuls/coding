package dataStructure.JDKLinkedList;

import dataStructure.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJohns);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

       /* Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //add to the tail
        list.add(billEnd);
        //list.addLast(billEnd);

        //remove
        list.removeFirst();
        list.removeLast();

        for(Employee employee: list){
            System.out.println(employee);
        }
    }
}
