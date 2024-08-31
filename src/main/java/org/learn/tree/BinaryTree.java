package org.learn.tree;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

}

public class BinaryTree {

    Node root;

    public void insert(int data) {

        root = insertRec(root, data);

    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void show() {
        inOrderRec(root);
        System.out.println();
        preOrderRec(root);
        System.out.println();
        postOrderRec(root);
    }


    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

}
