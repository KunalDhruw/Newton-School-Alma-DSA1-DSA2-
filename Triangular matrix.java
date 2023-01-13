/*
Triangular matrix
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size N*N, your task is to find the sum of the upper triangular matrix and the lower triangular matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Upper Triangular:-
M00 M01 M02
_____M11 M12
__________M22

Lower Triangular:-
M00__________
M10 M11_____
M20 M21 M22
Input
The first line of input contains a single integer N, The next N lines of input contains N space- separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of Upper and Lower Triangular Matrix separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
11 9

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
20 19
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int upper_sum = 0;
        int lower_sum = 0;
        /*calculate sum of upper triangle*/
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                if (i <= j)
                {
                    upper_sum += arr[i][j];
                }
            }
               /*calculate sum of lower*/
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                if (j <= i)
                {
                    lower_sum += arr[i][j];
                }
            }
        System.out.print(upper_sum+" "+lower_sum);
    }
}
