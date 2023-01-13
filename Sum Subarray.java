/*
Sum Subarray
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array Arr of N integers. A subarray is good if the sum of elements of that subarray is greater than or equal to K. Print the length of good subarray of minimum length.
Input
First line of input contains N and K.
Second line of input contains N integers representing the elements of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
1 <= K <= 1000000000000
Output
Print the length of good subarray of minimum length.
Example
Sample input
5 12
2 3 2 5 5

Sample output
3

Explanation :
Subarray from index 3 to 5 has sum 12 and is therefore good and its length(3) is minimum among all possible good subarray.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int minSubArrayLen(long target, int[] nums) {
        int si = 0;
        int ei = 0;
        int len = Integer.MAX_VALUE;
        long sum = 0;
        while (ei < nums.length) {
            sum += nums[ei];

            while (sum >= target) {
                len = Math.min(len, ei - si + 1);
                sum -= nums[si];
                si++;
            }

            ei++;
        }
        return len != Integer.MAX_VALUE ? len : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        int[]arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = minSubArrayLen(target,arr);
        System.out.println(min);

    }
}
