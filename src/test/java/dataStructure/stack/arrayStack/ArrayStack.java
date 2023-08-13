package dataStructure.stack.arrayStack;

import dataStructure.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top==stack.length){//O(n)
            //if stack is full need to resize the backing array
            Employee[] newArray = new Employee[2*stack.length];
            //copy from the stack
            //start from the 0 element
            //copy into the newArray
            //copying from the first element to the stack length elements
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            //assign new array to the stack field
            stack = newArray;
        }
        stack[top++] = employee;//O(1)
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
