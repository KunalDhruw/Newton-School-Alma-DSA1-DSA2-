/*
First non-repeating character in a String
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, find the first non-repeating character in the string and return its index. If it does not exist, return -1.
Input
First line of the input contains the string s.

Constraints
1<= s. length <= 100000
Output
Print the index of the first non- repeating character in a string
Example
Input
s = "newtonschool"

Output
1

Explanation
"e" is the first non- repeating character in a string
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        boolean count = false;
        for (int i = 0; i < str.length(); i++) {
            Character curreChar = str.charAt(i);
            if (map.containsKey(curreChar)) {
                int currFreq = map.get(curreChar);
                map.put(curreChar, currFreq + 1);
            } else {
                map.put(curreChar, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            Character currechar = str.charAt(i);
            int currFreq = map.get(currechar);
            if (currFreq == 1) {
                count = true;
                System.out.println(i);
                break;
            }
        }
        if (!count) {
            System.out.println(-1);
        }
    }
}
