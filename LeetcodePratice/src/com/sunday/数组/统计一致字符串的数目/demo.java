package com.sunday.数组.统计一致字符串的数目;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 统计一致字符串的数目
 * <p>
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 * <p>
 * 请你返回 words 数组中 一致字符串 的数目。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-the-number-of-consistent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test() {

    }

    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = words.length;
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
//            char[] index = words[i].toCharArray();

            /*for (char c : index) {
                if (set.add(c)){
                    count--;
                    set.remove(c);
                    break;
                }
            }*/

            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
