package com.chaselou.leetcode.d.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = 0;
        if (nums1 != null){
            totalSize += nums1.length;
        }
        if (nums2 != null){
            totalSize += nums2.length;
        }
        int x = 0, y = 0;
        if (totalSize % 2 == 0){
            double result1 = 0d, result2 = 0d;
            for (int i = 0; i < totalSize / 2 + 1; i++) {
                result1 = result2;
                if (nums1 != null && x < nums1.length && nums2 != null && y < nums2.length){
                    if (nums1[x] < nums2[y]){
                        result2 = nums1[x];
                        x++;
                    }else {
                        result2 = nums2[y];
                        y++;
                    }
                }else if (nums1 != null && x < nums1.length){
                    result2 = nums1[x];
                    x++;
                }else if (nums2 != null && y < nums2.length){
                    result2 = nums2[y];
                    y++;
                }
            }
            return (result1 + result2) / 2;
        }else {
            double result = 0d;
            for (int i = 0; i < totalSize / 2 + 1; i++) {
                if (nums1 != null && x < nums1.length && nums2 != null && y < nums2.length){
                    if (nums1[x] < nums2[y]){
                        result = nums1[x];
                        x++;
                    }else {
                        result = nums2[y];
                        y++;
                    }
                }else if (nums1 != null && x < nums1.length){
                    result = nums1[x];
                    x++;
                }else if (nums2 != null && y < nums2.length){
                    result = nums2[y];
                    y++;
                }
            }
            return result;
        }
    }
}