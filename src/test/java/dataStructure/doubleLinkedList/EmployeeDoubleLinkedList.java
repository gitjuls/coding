package dataStructure.doubleLinkedList;

import dataStructure.Employee;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size =0;

    public void addInMid(Employee employee, int index){
        EmployeeNode node = new EmployeeNode(employee);
        if(head == null){
            head = tail = node;
            head.setPrevious(null);
            tail.setNext(null);
        }else{
            EmployeeNode current = head;
            EmployeeNode temp = null;
            if(index==0){
                addToFront(employee);
            }else if(index==size){
                addToEnd(employee);
            }else {
                for (int i = 1; i < size; i++) {
                    if (i == index) break;
                    current = current.getNext();
                }
                temp = current.getNext();
               // temp.setPrevious(current);
                current.setNext(node);
                node.setPrevious(current);
                node.setNext(temp);
                temp.setPrevious(node);
            }
        }
        size++;
    }

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(head == null){
            tail = node;
        }else{
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty())return null;
        EmployeeNode removeNode = head;
        if(head.getNext() == null){
            tail = null;
        }else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty())return null;
        EmployeeNode removeNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public EmployeeNode removeFromMiddle(int index){
        if(isEmpty())return null;
        EmployeeNode removeNode = head;
        for(int i=1; i<size; i++){
            removeNode = removeNode.getNext();
            if(i==index)break;
        }
        //if node is head of the list
        if(removeNode == head){
            head = removeNode.getNext();
        }else
        //if node is tail of the list
        if(removeNode == tail){
            tail=tail.getPrevious();
        }else{
            removeNode.getPrevious().setNext(removeNode.getNext());
            removeNode.getNext().setPrevious(removeNode.getPrevious());
        }
        size--;
        removeNode.setPrevious(null);
        removeNode.setNext(null);
        return removeNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while(current != null){
            System.out.println(current);
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
