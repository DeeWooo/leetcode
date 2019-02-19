package com.dd299.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author ivywu
 * @version 1.0
 * @date 2019/2/19 9:02 AM
 **/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] sums = new int[2];

        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }


        return sums;


    }



    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        int[] twoNums = twoSum.twoSum(nums,target);

        System.out.println(Arrays.toString(twoNums));
    }




}
