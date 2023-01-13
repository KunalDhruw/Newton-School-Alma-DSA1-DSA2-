/*
Sum of Odd Length Subarrays
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of positive integers A of size N. The power of an array is defined as sum of all elements in it. Calculate the sum of powers of all possible odd - length subarrays.
A subarray is a contiguous subsequence of the array.
Input
First line contains an integer N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 1000
1 <= Ai <= 10^5
Output
Print the sum of powers of all possible odd - length subarrays.
Example
Sample Input 1:
5
1 4 2 5 3

Output
58

Explanation:
The odd- length subarrays of A and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1, 4, 2] = 7
[4, 2, 5] = 11
[2, 5, 3] = 10
[1, 4, 2, 5, 3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

Sample Input 2:
2
1 2

Output
3

Explanation:
There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long sumOddLengthSubarray(long[] arr) {
        long result = 0;
        long n = arr.length;

        for (int i = 0; i < n; i++) {
            long end = i + 1;
            long start = n - i;
            long total = start * end;
            long odd = total / 2;
            if (total % 2 == 1) {
                odd++;
            }
            result += odd * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] arr = new long[(int)n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long oddsumlength = sumOddLengthSubarray(arr);
        System.out.println(oddsumlength);
    }
}
