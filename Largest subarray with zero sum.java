/*
Largest subarray with zero sum
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[], of length N containing values in the range of negative to positive integers. You need to find the length of the largest subarray whose sum of elements is 0.
Input
The first line contains N denoting the size of the array A. Then in the next line contains N space-separated values of the array A.

Constraints:-
1 <= N <= 1e5
-1e6 <= A[i] <= 1e6
Output
Print the length of the largest subarray which has sum 0, If no subarray exist print -1.
Example
Sample Input:-
8
15 -2 2 -8 1 7 10 23

Sample Output:-
5

Explanation:-
-2 2 -8 1 7 is the required subarray

Sample Input:-
5
1 2 1 2 3

Sample Output:-
-1
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void sumZero(long[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean count = false;
        int mlen = 0;
        int i = -1;
        int sum = 0;
        map.put(sum, i);
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                int len = i - map.get(sum);
                if (mlen < len) {
                    mlen = len;
                }
                count = true;
            }
        }
        if (count == true) {
            System.out.println(mlen);
        } else {
            System.out.println(-1);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumZero(arr);
    }
}
