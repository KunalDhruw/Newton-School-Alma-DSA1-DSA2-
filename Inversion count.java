/*
Inversion count
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Calculate inversion count of array of integers.
Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].
Input
The first line contain integers N.
The second line of the input contains N singly spaces integers.

1 <= N <= 100000
1 <= A[i] <= 1000000000
Output
Output one integer the inversion count.
Example
Sample Input
5
1 1 3 2 2

Sample Output
2

Sample Input
5
5 4 3 2 1

Sample Output
10
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long count = 0;
    static int[] divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return arr;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        return conquer(arr, si, mid, ei);

    }

    static int[] conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
                count += mid + 1 - idx1;
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr,0,n-1);
        System.out.println(count);              // Your code here
    }
}
