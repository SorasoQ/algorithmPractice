package com.zjl.sort;

import java.util.PriorityQueue;

/**
 * @author zjl
 */
public class FindKthLargest {
    static int findKthLargest(int source[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int var:source){
            pq.add(var);
            if(pq.size()>k){pq.poll();}
        }
        return  pq.peek();
    }

    public static void main(String[] args) {
        int [] arr = {55,77,66,87,94,73,65,25,45,12,23,56};
        int result = findKthLargest(arr,5);
        System.out.println(result);
    }
}
