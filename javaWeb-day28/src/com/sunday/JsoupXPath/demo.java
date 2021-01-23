package com.sunday.JsoupXPath;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class demo {
    @Test
    public void test(){
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
    public static  int[] twoSum(int[] numbers, int target) {
        int index[] = {0,0};
        HashMap<Integer, Integer> num = new HashMap<>();
         for(int i=0;i<numbers.length;i++){
                        num.put(numbers[i], i);
                      }
                  for(int i=0;i<numbers.length;i++){
                         int temp = target-numbers[i];
                        if(num.containsKey(temp)&&i<num.get(temp)){
                         index[0] = i;
                               index[1] = num.get(temp);
                                  break;
                             }
                       }
                     return index;
                }
}
