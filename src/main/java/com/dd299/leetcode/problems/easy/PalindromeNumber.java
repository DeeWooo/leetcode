package com.dd299.leetcode.problems.easy;

/**
 * 9. 回文数
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * @author ivywu
 * @version 1.0
 * @date 2019/2/19 5:18 PM
 **/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        String reverse = reverseString(s);
        if(reverse.equals(s)){
            return true;
        }
        return false;
    }


    private String reverseString(String s){
        char[] chars =s.toCharArray();
        if (chars!=null){
            char[] reverseChars = new char[chars.length];
            int num = 0;
            for (int i = chars.length-1;i>=0;i--){
                reverseChars[num++] = chars[i];
            }

            return String.copyValueOf(reverseChars);
        }
        return null;
    }



    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 121;
        boolean output = palindromeNumber.isPalindrome(input);
        System.out.println(output);

        input = -121;
        output = palindromeNumber.isPalindrome(input);
        System.out.println(output);

        input = 10;
        output = palindromeNumber.isPalindrome(input);
        System.out.println(output);



    }
}
