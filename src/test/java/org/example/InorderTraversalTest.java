package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class InorderTraversalTest {
    InorderTraversal inorderTraversal;
    @BeforeEach
    void setUp() {
        inorderTraversal=  new InorderTraversal();
    }
    @Test
    @DisplayName("inorder traversal")
    public void testInorderTraversal() {
        //root= [1,null,2,3]
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        //expected output= [1,3,2]
        List<Integer> expected = List.of(1,3,2);
        assert (inorderTraversal.iterativeInorderTraversal(input).equals(expected));
    }
    @AfterEach
    void tearDown() {
        inorderTraversal = null;
    }
}