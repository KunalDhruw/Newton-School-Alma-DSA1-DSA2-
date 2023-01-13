/*
Median of Two sorted Arrays
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n))
Input
First line of input contains n, m the length of array A and B.
Next two lines contains input of array A and B.

Constraints
1 <= n, m <= 1000
-1e6 <= A[i], B[i] <= 1e6
Output
Print the median of two sorted arrays upto two decimal places.
Example
Sample Input :
2 1
1 3
2

Sample Output :
2.00
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int []A = new int[m];
        for (int i =0; i<m; i++){
            A[i] = sc.nextInt();
        }
        int []B = new int[n];
        for (int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }
        System.out.printf("%.2f",median(A,B,m,n));
    }
    static double median(int []arr1, int []arr2, int m, int n){
        int []finalArray = new int[n+m];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            if (arr1[i] < arr2[j]){
                finalArray[k++] = arr1[i++];
            }
            else{
                finalArray[k++] = arr2[j++];
            }
        }
        if (i<m){
            while (i<m)
            finalArray[k++] = arr1[i++];
        }
        if (j<n){
            while (j<n)
                finalArray[k++] = arr2[j++];
        }
        n = n+m;
        if (n%2==1)
            return finalArray[((n+1)/2)-1];
        else return ((double) finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
    }
}
