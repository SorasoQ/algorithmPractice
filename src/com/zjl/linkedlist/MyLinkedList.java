package com.zjl.linkedlist;

/**
 * @author zjl
 */
public class MyLinkedList {
    int size = 0;
    LinkedListNode head;

    /**
     * 从头部插入元素*/
    public void addHead(int val){
        if (head == null){
            head = new LinkedListNode(val);
        }else {
            LinkedListNode temp = new LinkedListNode(val,head);
            head = temp;
        }
        size++;
    }
    /**
     * 从尾部插入元素*/
    public void addTail(int val){
        if (head == null){
            head = new LinkedListNode(val);
        }else {
            LinkedListNode temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            new LinkedListNode(temp,val);
        }
        size++;


    }
    /**
     * 构造函数*/
    public MyLinkedList(int[]nums){
        for (int i:nums
             ) {
            addTail(i);
        }
    }


    /**
     * 链表大小*/
    public int size(){
        return size;
    }
    /**
     * 展示链表数据*/
    public void display() {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.nextNode;
        }
    }
    /**
     * 获取第index个元素*/
    public int getByIndex(int index){
        if(index > this.size|| index < 0){
            return -1;
        }else {
            int count = 0;
            LinkedListNode temp = new LinkedListNode(-1,head);
            while (count <= index){
                temp = temp.nextNode;
                count++;
            }
            return temp.val;
        }
    }
    /**
     * 在指定位置插入数据*/
    public void insertIntoList(int val, int index){
        LinkedListNode temp = new LinkedListNode(-1,head);

        LinkedListNode target = new LinkedListNode(val);
        int i = 0;
        while (i <= index){
            temp = temp.nextNode;
            i++;
        }
        temp.preNode.nextNode = target;
        target.preNode = temp.preNode;
        target.nextNode = temp;
        temp.preNode = target;
        size++;
    }
    public void deleteByIndex(int index){
        LinkedListNode temp = new LinkedListNode(-1,head);
        int i = 0;
        while (i <= index){
            temp = temp.nextNode;
            i++;
        }
        temp.preNode.nextNode = temp.nextNode;
        temp.nextNode.preNode = temp.preNode;
        size--;
    }

}

class SingleLinkedList{
    SingleLinkedListNode head ;
    int size;
    public SingleLinkedList(){
        head = new SingleLinkedListNode();
    }
    public void addByArray(int[] nums){
        for(int i:nums){
            addAtTail(i);
        }
    }
    public void addAtTail(int val){

        if (head.next == null){
            new SingleLinkedListNode(head,val);
        }else {
            SingleLinkedListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            new SingleLinkedListNode(temp,val);
        }
    }


    public void flipTheList(){
        SingleLinkedListNode pre = head.next;
        SingleLinkedListNode cur = head.next.next;
        SingleLinkedListNode temp = null;
        head.next.next = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = pre;
    }
    public void display(){
        SingleLinkedListNode temp = head.next;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;

        }
    }
}

class TestLinkedList{
    public static void main(String[]args){
        int nums[] = {1,2,4,5,6,7};
        //MyLinkedList testList = new MyLinkedList(nums);
        SingleLinkedList testList = new SingleLinkedList();
        testList.addByArray(nums);
        //testList.insertIntoList(3,1);
        //testList.deleteByIndex(2);
        testList.display();
        testList.flipTheList();
        testList.display();
    }
}

