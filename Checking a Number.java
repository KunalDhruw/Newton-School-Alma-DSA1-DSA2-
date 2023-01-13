/*
Checking a Number
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-1e9 <= n <= 1e9
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int positive(int number){
		if(number > 0){
			return 1;
		} else if (number < 0){
			return 0;
		}
		else {
			return -1;
		}

    }
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int number = sc.nextInt();
		
			int caseID = positive(number);
			switch(caseID){
			case 0:
				System.out.println("Negative");
				break;
			case 1:
				System.out.println("Positive");
				break;
			default:
				System.out.println("Zero");
            }
        	
    }
}
