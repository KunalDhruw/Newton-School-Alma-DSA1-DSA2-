/*
Infix to Postfix
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an infix expression, your task is to convert it into postfix.

Infix expression: The expression of the form a operator b. When an operator is in- between every pair of operands.
Postfix expression: The expression of the form a b operator. When an operator is followed for every pair of operands.

Valid operators are +, - , *, /, ^. Each operand is an uppercase english alphabet. Infix expression may contains parenthesis as '(' and ')'.

See example for better understanding.
Input
The input contains a single string of infix expression.

Constraints:-
1 <= |String| <= 40
Output
Output the Postfix expression.
Example
Sample Input:-
((A-(B/C))*((A/K)-L))

Sample Output:-
ABC/-AK/L-*

Sample Input:-
A+B

Sample Output:-
AB+
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 class Main {
    static int getPrecedence(char ch) {
        if (ch == '^') return 3;
        else if (ch == '/' || ch == '*') return 2;
        else if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop(); //remove then open bracket
            } else {
                while (!st.isEmpty() && getPrecedence(ch) <= getPrecedence(st.peek())) {
                    ans += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        System.out.println(ans);
    }
}
