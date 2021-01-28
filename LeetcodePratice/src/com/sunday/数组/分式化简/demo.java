package com.sunday.数组.分式化简;

import org.junit.Test;

/**
 *分式化简 LCP02
 *
 * 有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
 *
 *
 *
 * 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。
 *
 *  
 *
 * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/deep-dark-fraction
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * cont[length-2]+1/c[l-1]
 * c[l-2]*c[l-1]+1  分子
 * c[l-1] 分母
 */

public class demo {

    @Test
    public void test(){
        fraction(new int[]{3, 2, 0, 2});
    }

    public int[] fraction(int[] cont) {
        if(cont.length==1){
            return new int[]{cont[0],1};
        }
        if(cont.length==2){
            return new int[]{cont[0]*cont[1]+1,cont[1]};
        }
        int fm=cont[cont.length-1];
        int fz=cont[cont.length-1]*cont[cont.length-2]+1;
        for (int i = cont.length-3; i >=0; i--) {
            int temp=fz;
            fz=fm;
            fm=temp;
            fz= cont[i]*fm+fz;
        }
        return new int[]{fz,fm};
    }


}
