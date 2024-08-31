package org.learn.stack;

public class Runner {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Is Stack Empty : " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(10);

        stack.show();

        stack.push(11);

        System.out.println("Is Stack Empty : " + stack.isEmpty());

        System.out.println("size : " + stack.size());

        System.out.println("pop : " + stack.pop());

        stack.show();
        System.out.println("size : " + stack.size());

        System.out.println("peek : " + stack.peek());
    }
}
