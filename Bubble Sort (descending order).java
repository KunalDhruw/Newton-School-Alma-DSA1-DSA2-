/*
Bubble Sort (descending order)
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, sort the array in reverse order by simply swapping its adjacent elements.
Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000
Output
Output sorted array in descending order where each element is space separated.
Example
Sample Input:
6
3 1 2 7 9 87

Sample Output:
87 9 7 3 2 1
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void printarr(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int temp =0;
        int count ;
        for (int i=0; i<arr.length; i++){
            int min = arr[i];
            count = 0;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count = 1;
                }
            }
            if (count == 0){
                break;
            }
        }
         printarr(arr);
    }
}
