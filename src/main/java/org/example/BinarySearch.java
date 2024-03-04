package org.example;

public class BinarySearch {
    public int binarySearch(int[] nums, int x, int low, int high) {
        while (low<=high) {
            int mid=low+(high-low)/2;

            if (nums[mid]==x) {
                return mid;
            }
            if (nums[mid]<x) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
