package com.zjl.think.recursive;

public class InorderTraversal {
    static String GetIt(TreeNode root){
        if(root==null){return "";}
        if(root.left == null && root.right==null){return root.value+"";}
        else {return GetIt(root.left)+root.value+GetIt(root.right);}

    }

    public static void main(String[] args) {
        TreeNode testNode01 = new TreeNode(1);
        TreeNode testNode02 = new TreeNode(2);

        TreeNode testNode03 = new TreeNode(3);
        TreeNode testNode04 = new TreeNode(4);
        TreeNode testNode05 = new TreeNode(5);
        TreeNode testNode06 = new TreeNode(6);
        testNode04.left = testNode02;
        testNode04.right = testNode05;
        testNode05.right = testNode06;
        testNode02.left = testNode01;
        testNode02.right = testNode03;
        String result = GetIt(testNode04);
        System.out.println(result);


    }
}

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ value = x;}

}
