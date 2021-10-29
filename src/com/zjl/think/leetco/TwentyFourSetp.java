package com.zjl.think.leetco;

import java.util.HashMap;
import java.util.List;

/**
 * @author zjl
 */
public class TwentyFourSetp {
     private static String findMode(TreeNode root){

        if(root==null){return "";}
        if(root.left!=null){findMode(root.left);}
         return findMode(root.left)+ root.value+findMode(root.right);

     }

    public static void main(String[] args) {
         List<Integer> result = null;
         TreeNode testNode01 = new TreeNode(1);
         TreeNode testNode02 = new TreeNode(3);
         TreeNode testNode03 = new TreeNode(3);
         TreeNode testNode04 = new TreeNode(4);
         TreeNode testNode05 = new TreeNode(5);
         TreeNode testNode06 = new TreeNode(7);
         TreeNode testNode07 = new TreeNode(7);
         TreeNode testNode08 = new TreeNode(8);
         testNode05.left = testNode03;
         testNode05.right = testNode07;
         testNode03.right = testNode04;
         testNode03.left = testNode02;
         testNode02.left = testNode01;
         testNode07.left = testNode06;
         testNode07.right = testNode08;
         String test = findMode(testNode05);
         char []c = test.toCharArray();
         
        System.out.println(test);



    }
}
