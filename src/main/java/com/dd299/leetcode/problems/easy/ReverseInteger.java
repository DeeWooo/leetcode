package com.dd299.leetcode.problems.easy;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 *
 * @author ivywu
 * @version 1.0
 * @date 2019/2/19 9:30 AM
 **/
public class ReverseInteger {

    public int reverse(int x) {
        long y = 0;
        int yu = x % 10;
        int chu = x / 10;
        while (yu != 0 || chu != 0) {
            y = y * 10 + yu;
            yu = chu % 10;
            chu = chu / 10;
        }
        if (y > 2147483647 || y < -2147483648){
            return 0;
        }
        return (int) y;

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int input = 123;
        int output = reverseInteger.reverse(input);
        System.out.println(output);

        input = -123;
        output = reverseInteger.reverse(input);
        System.out.println(output);

        input = 120;
        output = reverseInteger.reverse(input);
        System.out.println(output);




    }
}
