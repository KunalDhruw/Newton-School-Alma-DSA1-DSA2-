/*
Matrix ZigZag Traversal
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no. of rows
        int m = sc.nextInt();// no. of columns
        int [][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(n+m-1);
        for(int i = 0; i < n + m - 1; i++)
        {
            ans.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                (ans.get(i+j)).add(arr[i][j]);
            }
        }

        for (int i = 0; i < ans.size(); i++)
        {
            for (int j = ans.get(i).size() - 1; j >= 0; j--)
            {    System.out.print(ans.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
