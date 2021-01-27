package com.sunday.数组.分词;

import org.junit.Test;

/**
 * Bigram 分词
 *
 * 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 *
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/occurrences-after-bigram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class demo {

    @Test
    public void test(){

    }

    public String[] findOcurrences(String text, String first, String second) {
        String[] split = text.split(" ");
        String[] index=new String[split.length];
        int count=0;
        for (int i = 0; i < split.length; i++) {
            if (i==split.length-2){
                break;
            }
            if (split[i].equals(first)&&split[i+1].equals(second)) {
                index[count++]=split[i+2];
            }
        }
        String[] newArr=new String[count];
        for (int i = 0; i < index.length; i++) {
            if (index[i]==null){
                break;
            }
            newArr[i]=index[i];
        }
        return newArr;
    }
}
