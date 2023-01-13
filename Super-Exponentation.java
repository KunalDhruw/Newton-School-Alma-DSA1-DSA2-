/*
Super-Exponentation
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Modulo exponentiation is super awesome. But can you still think of a solution to the following problem?
Given three integers {a, b, c}, find the value of abc % 1000000007.
Here ab means a raised to the power b or pow(a, b). Expression evaluates to pow(a, pow(b, c)) % 1000000007.

(Read Euler's Theorem before solving this problem)
Input
The first input line has an integer t: the number of test cases.
After this, there are n lines, each containing three integers a, b and c.


Constraints
1≤ t ≤ 100
0 ≤ a, b, c ≤ 1000000000
Output
For each test case, output the value corresponding to the expression.
Example
Sample Input
3
3 7 1
15 2 2
3 4 5

Sample Output
2187
50625
763327764

Explaination:
In the first test, a = 3, b = 7, c = 1
bc = 71 = 7
abc = 37 = 2187
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 != 0) {
                res = (res * x) % p;
            }
            y = y / 2;
            x = (x * x) % p;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        for (int i = 0; i < a; i++) {
            int b = ob.nextInt();
            int c = ob.nextInt();
            int d = ob.nextInt();
            int p = 1000000007;
            long temp = power(c, d, p - 1);
            long temp1 = power(b, temp, p);
            System.out.println(temp1);
        }
    }
}
