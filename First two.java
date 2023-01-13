/*
First two
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number N your task is to print its first two digits in reverse order. For eg:- If the given number is 123 then the output will be 21.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function firstTwo() that takes integer N argument.

Constraints:-
111 <= N <= 9999

Note:- It is guaranteed that the given number will not contain any 0.
Output
Return the first two digits of the given number in reverse order.
Example
Sample Input:-
3423

Sample Output:-
43

Sample Input:-
1234

Sample Output:-
21
*/


static int firstTwo(int N){
String s = Integer.toString(N);
int p = Integer.parseInt(String.valueOf(s.charAt(1))+String.valueOf(s.charAt(0)));
return p;
}
