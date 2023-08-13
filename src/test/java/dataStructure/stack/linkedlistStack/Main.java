package dataStructure.stack.linkedlistStack;

import dataStructure.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJohns = new Employee("Jane", "Johns", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedListStack stack = new LinkedListStack();
        stack.push(janeJohns);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);

        //stack.printStack();
        System.out.println("Pop " + stack.pop());
        stack.printStack();
    }
}
