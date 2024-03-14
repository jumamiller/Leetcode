package org.example;

public class UniqueBinaryTree {
    public int numTrees(int n) {
        return trees(1, n);
    }
    int trees(int left, int right) {
        if (left >= right) return 1;
        int total = 0;
        for (int i = left; i <= right; i++)
            total += trees(left, i - 1) * trees(i + 1, right);
        return total;
    }
}
