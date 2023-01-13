/*
Closest to x
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two arrays and an integer x. Calculate the minimum absolute difference between sum of pair of elements (one from each array) and the integer x.
Input
First line of input contains the length of the array N
Second line contains first array elements
Third line contains second array elements
Last line contains the value of x

Constraints:-
1<=N<=10000
1<=elements<=100000
1<=x<=100000
Output
Output a single line containing the minimum difference
Example
Sample Input:-
4
1 4 5 7
10 20 30 40
32

Sample Output:-
1

Explanation:
Required pair is 30,1.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        String[] str_arr1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(str_arr1[i]);
        }

        String[] str_arr2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(str_arr2[i]);
        }

        int K = Integer.parseInt(br.readLine());

        int min_Difference = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int difference = Math.abs(K - (arr1[i] + arr2[j]));
                min_Difference = Math.min(difference, min_Difference);
            }
            if (min_Difference == 0) {
                break;
            }
        }


        System.out.println(min_Difference);
    }
}
