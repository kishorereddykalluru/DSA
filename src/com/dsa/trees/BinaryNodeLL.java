package com.dsa.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNodeLL {

    BinaryNode root;

    public BinaryNodeLL() {
        this.root = null;
    }

    public void preOrder(BinaryNode binaryNode) {
        if(binaryNode == null)
            return;

        System.out.print(binaryNode.value + " ");
        preOrder(binaryNode.left);
        preOrder(binaryNode.right);
    }

    public void inOrder(BinaryNode binaryNode) {
        if(binaryNode == null)
            return;

        inOrder(binaryNode.left);
        System.out.print(binaryNode.value + " ");
        inOrder(binaryNode.right);

    }

    public void postOrder(BinaryNode binaryNode) {
        if(binaryNode == null)
            return;

        postOrder(binaryNode.left);
        postOrder(binaryNode.right);
        System.out.print(binaryNode.value + " ");
    }

    public void levelOrder(BinaryNode binaryNode) {
        if(binaryNode == null) return;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(binaryNode);
        while(!queue.isEmpty()) {
            BinaryNode remove = queue.remove();
            System.out.print(remove.value + " ");
            if(remove.left!=null) {
                queue.add(remove.left);
            }
            if(remove.right != null) {
                queue.add(remove.right);
            }
        }
    }
}
