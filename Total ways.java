/*
Total ways
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A message containing letters from A - Z is been encoded to numbers using the alphabetical order of the number i. e A - > 1, B - > 2,. , Z - >26.
Given the encoded message your task is to print the number of ways the message can be decoded.
Input
Input contains a single line containing the string S.

Constraints:-
1 < = N < = 5000

Note:- String will only contains integers from 0-9
Output
Print the number of ways to decode the message.

Note: Since answer can be quite large print your answer modulo 10^9 + 7
Example
Sample Input:-
226

Sample Output:-
2

Explanation:-
BZ VF BBF are the only possible decoded messages

Sample Input:-
102

Sample Output:-
1

Explanation:-
JB is the only possibility
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int M = 1000000007;
    static int numDecodings(String s) {
        Long[] memo = new Long[s.length()];
        return (int) ways(s, s.length() - 1, memo);
    }
    static long ways(String s, int i, Long[] memo) {
        if (i < 0)
            return 1;
        if (memo[i] != null)
            return memo[i];
        if (s.charAt(i) == '*') {
            long res = 9 * ways(s, i - 1, memo) % M;
            if (i > 0 && s.charAt(i - 1) == '1')
                res = (res + 9 * ways(s, i - 2, memo)) % M;
            else if (i > 0 && s.charAt(i - 1) == '2')
                res = (res + 6 * ways(s, i - 2, memo)) % M;
            else if (i > 0 && s.charAt(i - 1) == '*')
                res = (res + 15 * ways(s, i - 2, memo)) % M;
            memo[i] = res;
            return memo[i];
        }
        long res = s.charAt(i) != '0' ? ways(s, i - 1, memo) : 0;
        if (i > 0 && s.charAt(i - 1) == '1')
            res = (res + ways(s, i - 2, memo)) % M;
        else if (i > 0 && s.charAt(i - 1) == '2' && s.charAt(i) <= '6')
            res = (res + ways(s, i - 2, memo)) % M;
        else if (i > 0 && s.charAt(i - 1) == '*')
            res = (res + (s.charAt(i) <= '6' ? 2 : 1) * ways(s, i - 2, memo)) % M;
        memo[i] = res;
        return memo[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(numDecodings(s));

    }
}
