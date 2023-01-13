/*
Maximum Contiguous Subarray Sum
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, A of length N, find the contiguous subarray within A which has the largest sum.
Input
First line of each test case contain the number of test cases.
The first line of each test case contains an integer n, the length of the array A
and the next line contains n integers.

Constraints:
1<=T<=100
1 <= N <= 10^5
-10^6 <= A[i] <= 10^6
Output
Output an integer representing the maximum possible sum of the contiguous subarray.
Example
Input:
1
5
1 2 3 4 -10

Output:
10

Explanation:-
1+2+3+4=10
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long maxSum(long[] arr) {
        long maxsum = Integer.MIN_VALUE;
        long currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            if (maxsum < currsum) {
                maxsum = currsum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextLong();
            }
            long max = maxSum(arr);
            System.out.println(max);
        } // Your code here
    }
}
