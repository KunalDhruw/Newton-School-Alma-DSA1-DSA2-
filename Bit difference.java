/*
Bit difference
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, your task is to calculate the sum of bit difference in all pairs which can be formed.
Input
The first line of input contains a single integer N, the second line of input contains N space separated integers depicting values of the array.

Constraints:-
1 <= N <= 100000
0 <= Arr[i] <= 1000000000
Output
Print the sum of bit difference of all possible pairs.

Note:- Since the answer can be quite large print your answer modulo 109 + 7
Example
Sample Input:-
2
1 3

Sample Output:-
2

Explanation:-
(1, 1) = 0
(1, 3) = 1
(3, 1) = 1
(3, 3) = 0

Sample Input:-
2
1 2

Sample Output:-
4
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	//1,3 => 3, 1
	//(nc2) * 2
	

	static long mod = (long) 1e9+7;

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextLong();
		}
		long result = 0;
		for(int i = 0; i < 64; i++){
			long count = 0; //how many ones in that column bit
			long bitshift = (1l << i); //000.....10
			for(int j = 0; j < n; j++){
				if((array[j] & bitshift) == 0){
					count++; //counting number of 0's last bit + second last bit
				}
			}
			result += (count*(n - count)*2);
			result %= mod;
		}
		System.out.println(result);
	}
}
