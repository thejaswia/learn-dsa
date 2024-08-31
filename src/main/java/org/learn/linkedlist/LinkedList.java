package org.learn.linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        head = node;
    }

    public void insertAt(int index, int data) {

        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {
        Node node = null;

        if (index == 0) {
            node = head;
            head = node.next;
            node = null;
        } else {
            node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node n1 = node.next;

            node.next = n1.next;

            n1 = null;

        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
