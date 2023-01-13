/*
Bit count
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Negi is fascinated with the binary representation of the number. Tell him the number of set bits (ones) in the binary representation of an integer N.
Input
The first line of the input contains single integer N.

Constraints
1 <= N <= 1000000000000
Output
The output should contain a single integer, the number of set bits (ones) in the binary representation of an integer N.
Example
Sample Input
7

Sample Output
3

Sample Input
16

Sample Output
1
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void setbits (long n){
        long count =0;
        while ( n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        setbits(num);
        

    }
}
