package com.chaselou.leetcode.e.LongestPalindromicSubstring;

public class LongestPalindromicSubstring{
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int palindromicLength = s.length();
        int start = 0, end;
        while (palindromicLength > 0){
            end = start + palindromicLength - 1;
            while (end <  s.length()){
                if (isPalindrome(chars,start,end)){
                    return s.substring(start, end + 1);
                }
                start++;
                end = start + palindromicLength - 1;
            }
            start = 0;
            palindromicLength--;
        }
        return "";
    }

    /**
     * 判断给定的chars数组中，指定的区间内，是否是回文字符串
     * @param chars
     * @param start
     * @param end
     * @return
     */
    private boolean isPalindrome(char[] chars, int start, int end){
        while (start < end){
            if (chars[start] == chars[end]){
                start ++;
                end --;
            }else {
                return false;
            }
        }
        return true;
    }
}