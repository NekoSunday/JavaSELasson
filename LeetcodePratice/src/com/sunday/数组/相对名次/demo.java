package com.sunday.数组.相对名次;

import org.junit.Test;

import java.util.*;

/**
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 *
 * (注：分数越高的选手，排名越靠前。)
 *
 * 输出的数据对应输入的数据
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-ranks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {
    @Test
    public void test(){
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 3, 4, 2, 1})));
    }
    /**
     * 占用内存相对少一点
     */
    /*public String[] findRelativeRanks(int[] nums) {
        String[] index=new String[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < list.size() ; i++) {
            if (i==0) {
                map.put(list.get(i),"Gold Medal");
            }else if(i==1){
                map.put(list.get(i),"Silver Medal");
            }else if (i==2){
                map.put(list.get(i),"Bronze Medal");
            }else{
                map.put(list.get(i),""+(i+1)+"");
            }
        }
        int indexnum=0;
        for (int num : nums) {
            index[indexnum++]=map.get(num);
        }
        return index;
    }*/

    /**
     * 速度快
     * @param nums
     * @return
     */
    /*public String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        int[] newArr = Arrays.copyOf(nums, length);
        Arrays.sort(newArr);
        String[] index= new String[length];
        for (int i = 0; i < length; i++) {

            int search =length - Arrays.binarySearch(newArr, nums[i]);
            switch (search){
                case 1:
                    index[i]="Gold Medal";
                    break;
                case 2:
                    index[i]="Silver Medal";
                    break;
                case 3:
                    index[i]="Bronze Medal";
                    break;
                default:
                    index[i]=String.valueOf(search);
            }
        }
        return index;
    }*/

    /**
     * 两者合一
     * @param nums
     * @return
     */

    public String[] findRelativeRanks(int[] nums) {
        //将原数组在hashmap中顺序插入
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        //对输入数组排序
        Arrays.sort(nums);
        //新建一个返回数组
        int length= nums.length;
        String[] strings = new String[length];
        for (int i = length - 1; i >=0 ; i--) {
            if (i == length - 1) {
                strings[map.get(nums[i])] = "Gold Medal";
            } else if (i == length - 2) {
                strings[map.get(nums[i])] = "Silver Medal";
            } else if (i == length - 3) {
                strings[map.get(nums[i])] = "Bronze Medal";
            } else {
                strings[map.get(nums[i])] = String.valueOf(length - i );
            }
        }
        return strings;
    }
}
