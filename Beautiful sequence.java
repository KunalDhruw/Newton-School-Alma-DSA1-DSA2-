/*
Beautiful sequence
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a string S consisting of lowercase English letters. He defines S′ to be the string after removing all "a" characters from S (keeping all other characters in the same order). He then generates a new string T by concatenating S and S′. In other words, T=S+S′.

You are given a string T. Your task is to find some S that Bob could have used to generate T. It can be shown that if an answer exists, it will be unique.
Input
The first line contains a single string S.

Constraints:
1<=|S|<=100000
Output
Print a string S that could have generated T. It can be shown if an answer exists, it is unique. If no string exists, print ":(" (without double quotes, there is no space between the characters).
Example
Sample Input 1:
ababacacbbcc

Sample Output 1:
ababacac

Explanations:
we have s= "ababacac", and s′= "bbcc", and t=s+s′= "ababacacbbcc".

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String S = str.replaceAll("a", "");
		String T = "";
		String T1 = "";
		
		T = S.substring(0, S.length()/2);
		T1 = S.substring(S.length()/2,S.length());
		if(T.equals(T1)) {
			str = str.substring(0,str.length() - T1.length());
			System.out.println(str);
		}else {
			System.out.println(":(");
		}
    }
}
