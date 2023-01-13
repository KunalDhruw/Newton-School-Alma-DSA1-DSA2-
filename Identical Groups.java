/*
Identical Groups
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?

Identical groups mean there are equal number of same coloured balls in each group.
Input
A single line containing two integers x and y.

Constraints:
1<=x, y<=10000000
Output
Return the largest number of groups that can be made.
Example
Sample Input
3 9

Sample Output
3

Explanation:-
1 red ball and 3 blue ball will be in each group.

Sample Input:
4 9

Sample Output:
1
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd(int num_first , int num_second) {
    int i= num_first%num_second;
    while(i!=0){
        num_first = num_second;
        num_second = i ;
        i = num_first%num_second;
    }
    return num_second;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x ,y));
        }     
    }
