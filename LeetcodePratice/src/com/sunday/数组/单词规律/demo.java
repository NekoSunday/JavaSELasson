package com.sunday.数组.单词规律;

import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

public class demo {
    /**
     * 单词规律
     *
     * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
     *
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/word-pattern
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    @Test
    public void test(){
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        HashMap<Object,Integer> map=new HashMap<>();
        if (split.length!=pattern.length()){
            return false;
        }
        for (int i = 0; i < split.length; i++) {
           if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(split[i], i))){
               return false;
           }
        }
        return true;
    }

    /**
     *
     * 理解版本
     * public boolean wordPattern(String pattern, String s) {
        char[] pattenChar = pattern.toCharArray();
        String[] split = s.split(" ");
        HashMap<Object,Integer> map=new HashMap<>();
        if (split.length!=pattenChar.length){
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!Objects.equals(map.put(pattenChar[i], i), map.put(split[i], i))){
                return false;
            }
        }
        return true;
    }
     */
}
