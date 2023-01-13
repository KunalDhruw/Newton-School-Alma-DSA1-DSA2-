/*
Coolest and Hottest Subarrays
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The coolness of the subarray of an array is the sum of elements in the subarray. The coolest subarray is the subarray having the maximum coolness, while the hottest subarray is the one having minimum coolness (obviously it can be negative). The coolest and the hottest subarrays are always non-empty.

Tono believes that cool and hot are happy together. The happiness of the array is the absolute difference between the coolness of its coolest and its hottest subarray.

Given an array A consisting of N elements, find its happiness.
Input
The first line of the input contains an integer N.
The next line contains N singly spaced integers A[1], A[2],...A[N]

Constraints
1 <= N <= 200000
-1000000000 <= A[i] <= 1000000000
Output
Output a single integer, the happiness of the array.
(The output may not fit into 32 bit integer datatype, use long long integer datatype instead).
Example
Sample Input
5
-1 2 -3 1 -5

Sample Output
9

Explanation: Coolest subarray of the array is [2], while the hottest subarray of the array is [-3, 1, -5]. The happiness of the array is 2-(-7)=9.
*/



import java.io.*; 
import java.util.*; 

class Main {
    public static long minSubArraySum(long[] arr) {
        long minSum = Long.MAX_VALUE;
        long curSum = 0;
        for (long num : arr) {
            curSum += num;
            minSum = Math.min(minSum, curSum);
            curSum = Math.min(curSum, 0);
        }
        return minSum;
    }

    public static long maxSubArraySum(long[] arr) {
        long maxSum = Long.MIN_VALUE;
        long curSum = 0;
        for (long num : arr) {
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
            curSum = Math.max(curSum, 0);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long happiness = maxSubArraySum(arr) - minSubArraySum(arr);
        System.out.println(happiness);
    }
}
