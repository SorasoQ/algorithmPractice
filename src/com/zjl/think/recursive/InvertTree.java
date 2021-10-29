package com.zjl.think.recursive;

/**
 * @author zjl
 */
class Node{
    int value;
    Node left;
    Node right;
    public Node(int x){ value = x;}
}
public class InvertTree {
    static void invertTree(Node root){
        if(root == null){return;}
        Node right = root.right;
        root.right = root.left;
        root.left = right;
        invertTree(root.left);
        invertTree(root.right);
    }

    public static void main(String[] args) {
        Node testNode01 = new Node(1);
        Node testNode02 = new Node(2);

        Node testNode03 = new Node(3);
        Node testNode04 = new Node(4);
        Node testNode05 = new Node(5);
        Node testNode06 = new Node(6);
        Node testNode07 = new Node(7);
        testNode04.left = testNode02;
        testNode04.right = testNode05;
        testNode05.right = testNode07;
        testNode05.left = testNode06;
        testNode02.left = testNode01;
        testNode02.right = testNode03;
        invertTree(testNode04);
        System.out.println("end");
    }
}
