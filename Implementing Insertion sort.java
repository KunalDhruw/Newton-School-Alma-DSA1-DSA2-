/*
Implementing Insertion sort
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.
Input
First line of the input denotes number of test cases T. First line of the testcase is the size of array N and second line consists of array elements separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3
Output
For each testcase print the sorted array in a new line.
Example
Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1

Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10

Explanation:
Testcase 1: The array after perfoming insertion sort: 1 3 4 7 9.
Testcase 2: The array after performing insertion sort: 1 2 3 4 5 6 7 8 9 10.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt();
            }
            for(int k=1; k<arr.length; k++){
                int temp = arr[k] , l =k;
                while(l>0 && arr[l-1]>temp){
                    arr[l] = arr[l-1];
                    l--;
                }
                arr[l] = temp;
            }
            for(int val:arr){
                System.out.print(val +" ");
            }
            System.out.println();
        }
    }
}
