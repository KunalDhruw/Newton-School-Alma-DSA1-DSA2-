/*
Max Circular Subarray Sum
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum containing at least 1 element.
Input
The first line of input contains a single integer T which denotes the number of test cases. The first line of each test case contains a single integer N which denotes the total number of elements. The second line of each test case contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
-10^6 <= Arr[i] <= 10^6

The Sum of N over all test cases is less than equal to 10^6.
Output
For each test case print the maximum sum obtained by adding the consecutive elements.
Example
Input:
4
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1
4
-1 -2 -3 -4

Output:
22
23
52
-1

Explanation:
Testcase 1: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives the maximum sum as 22.
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int []arr = new int[n];
            String []str_arr = br.readLine().split(" ");
            for(int j=0; j<n; j++){
            arr[j] = Integer.parseInt(str_arr[j]);
             }
            int maxsum = maxSubarraySumCircular(arr);
            System.out.println(maxsum);
    }
  }
}
