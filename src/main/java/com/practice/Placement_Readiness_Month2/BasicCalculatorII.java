package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/basic-calculator-ii/description/
 */

import java.util.Scanner;
import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(calculate(s));
    }

    private static int calculate(String s) {

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            } else if (Character.isDigit(arr[i])) {
                String num = arr[i] + "";
                while (i + 1 < arr.length && Character.isDigit(arr[i + 1])) {
                    i++;
                    num += arr[i];
                }
                operands.push(Integer.parseInt(num));
            } else {
                while (operators.size() > 0 && precedance(arr[i]) <= precedance(operators.peek())) {
                    int b = operands.pop();
                    int a = operands.pop();
                    char opr = operators.pop();

                    int ans = eval(a, b, opr);
                    operands.push(ans);
                }
                operators.push(arr[i]);
            }
        }

        while (operands.size() > 1) {
            int b = operands.pop();
            int a = operands.pop();
            char opr = operators.pop();

            int ans = eval(a, b, opr);
            operands.push(ans);
        }

        return operands.peek();
    }

    private static int precedance(char ch) {
        if (ch == '+' || ch == '-')
            return 1;

        return 2;
    }

    private static int eval(int a, int b, char opr) {
        if (opr == '+')
            return a + b;
        else if (opr == '-')
            return a - b;
        else if (opr == '*')
            return a * b;
        else
            return a / b;
    }
}
