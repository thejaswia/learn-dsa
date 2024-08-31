package org.learn.queue;

public class Queue {

    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = data;
            rear++;
            size++;
        }
    }

    public int deQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            int data = queue[front];
            front++;
            size--;
            return data;
        }

    }

    public void show() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + "  ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == 5;
    }

}
