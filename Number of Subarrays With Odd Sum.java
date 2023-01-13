/*
Number of Subarrays With Odd Sum
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of integers, find the number of subarrays with an odd sum.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 10^5
1 <= Ai <= 10^5
Output
Print the number of subarrays with an odd sum.
Example
Sample Input 1:
3
1 3 5

Output
4

Explanation:
All subarrays are [1], [1, 3], [1, 3, 5], [3], [3, 5], [5]
All sub- arrays sum are [1, 4, 9, 3, 8, 5].
Odd sums are [1, 9, 3, 5] so the answer is 4.

Sample Input 2:
3
2 4 6

Output
0

Explanation:
All subarrays are [2], [2, 4], [2, 4, 6], [4], [4, 6], [6]
All sub- arrays sum are [2, 6, 12, 4, 10, 6].
All sub- arrays have even sum and the answer is 0.
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long numOfSubarrays(long[] arr) {
        long odd = 0, even = 1, n = arr.length;
        long currSum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long ans = numOfSubarrays(arr);
        System.out.println(ans);
    }
}
