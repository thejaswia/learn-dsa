package org.learn.linkedlist;

public class Runner {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(12);
        linkedList.insert(5);
        linkedList.insert(10);

        linkedList.insertAtStart(3);
        linkedList.insertAtStart(2);
        linkedList.insertAtStart(1);

        linkedList.insertAt(3, 3);
        linkedList.insertAt(4, 4);

        linkedList.show();

        linkedList.deleteAt(2);
        linkedList.deleteAt(0);

        System.out.println("After deleting:");
        linkedList.show();
    }
}
