package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinaryTreeTest {
    UniqueBinaryTree uniqueBinaryTree;
    @BeforeEach
    void setUp() {
        uniqueBinaryTree=new UniqueBinaryTree();
    }

    @Test
    @DisplayName("Unique Binary Search Trees")
    public void testNumTrees() {
        assertEquals(5, uniqueBinaryTree.numTrees(3));
        assertEquals(14, uniqueBinaryTree.numTrees(4));
        assertEquals(42, uniqueBinaryTree.numTrees(5));
    }

    @AfterEach
    void tearDown() {
        uniqueBinaryTree=null;
    }
}