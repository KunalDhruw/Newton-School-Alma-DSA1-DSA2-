/*
Anti clockwise
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample output
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample output
1 4 7 8 9 6 3 2 5
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int size = n;
        int i = size, k = 0, flag = 0, j = 0;

        // Print all layers one by one
        while (i > 0) {

            // Print First Column of Current Layer
            for (j = flag; j < i; j++) {
                System.out.print(arr[j][k] + " ");
            }
            i = i - 1;
            j = j - 1;
            k = j;

            // Print bottom row and last column
            // of current layer
            if (i > 0) {
                for (j = size - i; j < i + 1; j++)
                    System.out.print(arr[k][j] + " ");
                for (j = k - 1; j > size - i - 2; j--)
                    System.out.print(arr[j][k] + " ");
            } else
                break;
            j = j + 1;
            k = j;
            i = i - 1;

            // Print top row of current layer
            if (i > 0) {
                for (j = i; j > size - i - 2; j--)
                    System.out.print(arr[k][j] + " ");
                k = k + 1;
                i = i + 1;
                flag = flag + 1;
            } else
                break;
        }
    }
}
