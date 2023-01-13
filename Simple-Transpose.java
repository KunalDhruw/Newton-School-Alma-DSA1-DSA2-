/*
Simple-Transpose
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a NxN matrix. You need to find the transpose of the matrix.
The matrix is of form:
a b c ...
d e f ...
g h i ...
...........
There are N elements in each row.
Input
The first line of the input contains an integer N denoting the size of the square matrix.
The next N lines contain N single-spaced integers.

Constraints
1 <= N <= 100
1 <=Ai <= 100000
Output
Output the transpose of the matrix in similar format as that of the input.
Example
Sample Input
2
1 3
2 2

Sample Output
1 2
3 2

Sample Input:
1 2
3 4

Sample Output:
1 3
2 4
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr [][] = new int[n][n];
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
           }
       }
       int transpose [][]= new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
        }
    }
}
