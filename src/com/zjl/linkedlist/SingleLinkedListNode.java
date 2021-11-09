package com.zjl.linkedlist;

public class SingleLinkedListNode {
    int val;
    SingleLinkedListNode next;

    public SingleLinkedListNode(int val){
        this.val = val;
    }
    public SingleLinkedListNode(){}
    public SingleLinkedListNode(SingleLinkedListNode node, int val){
        this.val = val;
        node.next = this;
    }


}
