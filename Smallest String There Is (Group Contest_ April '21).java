/*
Smallest String There Is (Group Contest: April '21)
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a positive integer N, construct a string of length N such that no two adjacent characters are same. Among all possible strings, find the lexicographically minimum string.
Note: You can use only lowercase characters from 'a' to 'z'.
Input
The first and the only line of input contains an integer N.

Constraints:
1 <= N <= 100000
Output
Print the required string.
Example
Sample Input
1

Sample Output
a

Sample Input
2

Sample Output
ab
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int asciiCodeOfa = 97;
        int c=0; int letter;
       
        while(n>0){
            if(c>1){
                c=0;
                
            }
            letter = asciiCodeOfa + c;
            System.out.print(((char)letter));
            c++;
            n--;
        }
    }
}
