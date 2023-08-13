package dataStructure;

import java.util.LinkedList;

public class SingleLinkedList {
    //LinkedList is a collections of Nodes
    //good for insertion and deletion

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        //removing the node from end of the Linked list
        System.out.println(linkedList.pop());
        System.out.println(linkedList.peek());
        System.out.println(linkedList);

    }
}
