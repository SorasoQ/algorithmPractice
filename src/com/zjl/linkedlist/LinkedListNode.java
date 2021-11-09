package com.zjl.linkedlist;

/**
 * @author zjl
 */
public class LinkedListNode {
    int val;
    LinkedListNode preNode;
    LinkedListNode nextNode;

    public LinkedListNode(){}

    public LinkedListNode(int val){
        this.val = val;
    }
    public LinkedListNode(int val, LinkedListNode node){
        this.val = val;
        this.nextNode = node;
        node.preNode = this;
    }

    public LinkedListNode(LinkedListNode node, int val){
        this.val = val;
        this.preNode = node;
        node.nextNode = this;
    }
}
