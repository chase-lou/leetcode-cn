package com.example.demo;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/
 * 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        LinkedList strLinkedList = new LinkedList();
        int result = 0;
        int current = 0;
        for (char c : s.toCharArray()) {
            if (strLinkedList.contains(c)){
                int index = strLinkedList.indexOf(c);
                for (int i = 0; i <= index; i++) {
                    strLinkedList.removeFirst();
                }
                strLinkedList.addLast(c);
                current = strLinkedList.size();
            }else {
                strLinkedList.addLast(c);
                current ++;
            }
            result = result > current ? result : current;
        }
        return result;
    }
}
