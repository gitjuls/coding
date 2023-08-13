package dataStructure.queue.arrayQueue;

import dataStructure.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(janeJohns);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);

        //queue.printQueue();
        queue.remove();
        queue.printQueue();
        //System.out.println(queue.peek());
    }
}
