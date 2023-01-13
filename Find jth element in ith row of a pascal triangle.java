/*
Find jth element in ith row of a pascal triangle
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In a pascal triangle starting from top to bottom. Find the value of the element in a given row and column position i.e. ith row and at jth position.

Input
The first line of input contains an integer T denoting the number of test cases. Each test case will have two integers indexes of the ith row and jth column provided in the new line.

Constraints:
1 <= T <= 100
0 <= j <= i <= 500
Output
Print the answer for each testcase in separated line. Since the output can be very large, mod your output by 10^9+7.
Example
Input:
2
0 0
2 1

Output:
1
2
Explanation: The Pascal Triangle has first value as 1. (0th row 0th element). The pascal triangle has next set of values as 1 1. (1th row). On the next level, pascal triangle has values 1 2 1. (2nd row). Its 1st element is 2. (0 based).
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int row = sc.nextInt();
            int colm = sc.nextInt();

            int max = Math.max(row, colm);
            long[][] a = new long[max + 1][max + 1];
            for (int j = 0; j < max + 1; j++) {
                for (int k = 0; k < max + 1; k++) {
                    if (k == 0 || k == j) {
                        a[j][k] = 1;
                    } else if (k < j && k != 0 && j != 0) {
                        a[j][k] = (a[j - 1][k] % ((long) Math.pow(10, 9) + 7) + a[j - 1][k - 1] % ((long) Math.pow(10, 9) + 7));
                    } else {
                        a[j][k] = 0;
                    }
                }
            }
            System.out.print((a[row][colm]) % ((long) Math.pow(10, 9) + 7));
            System.out.println();
        }
    }
}
