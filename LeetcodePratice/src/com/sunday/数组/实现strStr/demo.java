package com.sunday.数组.实现strStr;

import org.junit.Test;

/**
 * 实现 strStr()
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){

    }

    public int strStr(String haystack, String needle) {
        if (haystack.length()==0&&needle.length()==0){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
