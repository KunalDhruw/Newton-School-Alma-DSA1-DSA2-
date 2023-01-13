/*
Multiplication
easy

Problem Statement
Given two numbers m and n, multiply them using only "addition" operations.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Multiply() that takes the integer M and N as a parameter.

Constraints:
1 ≤ T ≤ 100
0 ≤ M, N ≤ 100
Output
Return the product of N and M.
Example
Sample Input
2
2 3
3 4

Sample Output
6
12
*/


static int  Multiply_by_recursion(int M, int N) 
    { 
      if(N>M){
          return Multiply_by_recursion(N , M);
      }
      else if(N!=0){
          return(M + Multiply_by_recursion(M , N-1));
      }
      else{
          return 0;
      }
    }
