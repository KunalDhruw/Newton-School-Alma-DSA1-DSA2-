/*
Toys
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara want to buy a toy and for this purpose she goes to a toy shop, there is a special offer going in the toy shop that is if you buy one toy you can get extra k toys for free now Sara wonders what is the minimum amount of money she need to spend so that she can get all the toys.

You are given some queries containing values of k you need to print the minimum amount of cost Sara need to spend to get all the toys for each value of k.
Input
First line contain number of toys N and the number of queries Q
Second line contains the cost of the toys
Next Q line contains a single integer that is the value of k

Constraint:-
1<=N, Q<=100000
1<=Arr[i], k<=1000000
Output
Output the minimum cost for each query
Example
Sample Input :
6 2
100 20 50 10 2 5
3
4


Sample Output :
7
7

Explanation:
She can buy toy at index 5 and get toys at index 1, 2, 3 for free than she buy toy at index 6 and get toy at index 4 for free so the total cost becomes 7
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int findMinimum(int arr[], int n, int k) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
            n = n - k;
        }
        return res;
    }
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < Q; i++) {
            int m = sc.nextInt();
            int res = findMinimum(arr, N, m);
            System.out.println(res);
        }
    }
}
