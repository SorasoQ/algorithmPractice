package com.zjl.linkedlist;


/**
 * @author zjl
 */
public class DeleteTheNum {
    public static MyNode deleteTheNum(MyNode head, int val){
        if(head == null){return  head;}
        MyNode virHead = new MyNode(-1,head);
        MyNode pre = virHead;
        MyNode cur = head;
        while (cur != null){
            if(cur.val == val){
                pre.nextNode = cur.nextNode;
            }else{
                pre = cur;
            }

            cur = cur.nextNode;
        }
        return virHead.nextNode;
    }


}
class MyNode{
    int val;
    MyNode preNode;
    MyNode nextNode;

    public MyNode(int val){
        this.val = val;
    }
    public MyNode(int val,MyNode node){
        this.val = val;
        this.nextNode = node;
        node.preNode = this;
    }
    public MyNode(MyNode node,int val){
        this.val = val;
        this.preNode = node;
        node.nextNode = this;
    }
}

class Test{
    public static void main(String[] args) {
        MyNode head = new MyNode(4);
        MyNode node_01 = new MyNode(head,2);
        MyNode node_02 = new MyNode(node_01,1);
        MyNode node_03 = new MyNode(node_02,4);
        MyNode node_04 = new MyNode(node_03,5);
        MyNode node_05 = new MyNode(node_04,6);
        MyNode result = DeleteTheNum.deleteTheNum(head,4);
        while (result!=null){
            System.out.println(result.val);
            result = result.nextNode;
        }
    }
}
