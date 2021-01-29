package com.sunday.数组.设计Goal解析器;

import org.junit.Test;

/**
 * 设计 Goal 解析器
 *
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 *
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/goal-parser-interpretation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){

    }

    /**
     * 能理解的答案
     * @param command
     * @return
     */
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        StringBuilder index=new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='('&&chars[i+1]==')') {
                index.append("o");
            }else if (chars[i]=='('||chars[i]==')'){
            }else {
                index.append(chars[i]);
            }
        }
        return index.toString();
    }

    /**
     * 最短答案
     */

    /*public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }*/
}
