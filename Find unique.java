/*
Find unique
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.
Find the unique number.
Input
An integer, N, representing the size of the array. In the next line, N space-separated integers follow.

Constraints:
1 <= N <=105
1 <= A[i] <=108
Output
Output the element with frequency 1.
Example
Input :
5
1 1 2 2 3

Output:
3
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int res = arr[0];
        for(int i=1; i<size; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
