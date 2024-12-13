package com.dsa.trees;

public class Main {

    public static void main(String[] args) {

        BinaryNode b1 = new BinaryNode(1);
        BinaryNode b2 = new BinaryNode(2);
        BinaryNode b3 = new BinaryNode(3);
        BinaryNode b4 = new BinaryNode(4);
        BinaryNode b5 = new BinaryNode(5);
        BinaryNode b6 = new BinaryNode(6);


        b1.left = b2;
        b2.left = b3;
        b3.left = b4;
        b4.left = b5;
        b5.left = b6;

        BinaryNodeLL binaryNodeLL = new BinaryNodeLL();
        binaryNodeLL.root = b1;

//        binaryNodeLL.preOrder(binaryNodeLL.root);
//        System.out.println();
//        binaryNodeLL.inOrder(binaryNodeLL.root);
//        System.out.println();
//        binaryNodeLL.postOrder(binaryNodeLL.root);
//        System.out.println();
        binaryNodeLL.levelOrder(binaryNodeLL.root);


    }
}
