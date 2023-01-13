/*
Finding roots
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a = s.nextInt();
        float b = s.nextInt();
        float c = s.nextInt();

        int i = 0;

        float d = (b * b) - (4 * a * c);
        float sq = (float) Math.sqrt(d);
        float first = 0.0f, second = 0.0f, imaginary = 0.0f;

        if (d > 0) {
            i = 1;
        }

        if (d < 0) {
            i = 2;
        }

        if (d == 0) {
            i = 3;
        }

        switch (i) {

            case 1: {
                first = (-b + sq) / (2 * a);
                second = (-b - sq) / (2 * a);
                String str1 = String.format("%.2f", first);
                String str2 = String.format("%.2f", second);
                System.out.println(str1);
                System.out.print(str2);
                break;
            }

            case 2: {
                first = (-b) / (2 * a);
                sq = (float) Math.sqrt(-d);
                imaginary = sq / (2 * a);
                String str1 = String.format("%.2f", first);
                String str2 = String.format("%.2f", imaginary);
                System.out.println(str1 + "+i" + str2);
                System.out.print(str1 + "-i" + str2);
                break;
            }

            case 3: {
                first =  (-b) / (2 * a);
                String str = String.format("%.2f", first);
                System.out.println(str);
                System.out.print(str);
                break;
            }

        }
    }
}
