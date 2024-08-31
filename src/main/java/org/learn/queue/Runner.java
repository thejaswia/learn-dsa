package org.learn.queue;

public class Runner {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        queue.show();
        System.out.println("size : " + queue.size);
        queue.enQueue(6);

        queue.deQueue();
        queue.deQueue();

        queue.show();
        System.out.println("size : " + queue.getSize());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.show();
        System.out.println("size : " + queue.getSize());
        queue.deQueue();
        queue.show();
        System.out.println("size : " + queue.getSize());


    }
}
