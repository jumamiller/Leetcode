package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    //Given the root of a binary tree, return the inorder traversal of its nodes' values.
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        //inorder goes left-root-right
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }
    public List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

}
