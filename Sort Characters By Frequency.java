/*
Sort Characters By Frequency
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Input
First line of the input contains the string s.

Constraints
1<= s.length <= 500000
s consists of uppercase and lowercase English letters
Output
Print the lexicographically sorted string.
Example
Sample Input 1:
tree
Sample Output 1:
eert

Sample Input 2:
acaacc
Sample Output 2:
aaaccc

Explanation
For Input 1 : 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
For Input 2: Both 'c' and 'a' appear three times, so "aaaccc" is the valid answer as it is lexicographically smallest.
Note : cccaaa is not valid answer.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Character> arr[] = new List[S.length() + 1];
        for (Character ch : map.keySet()) {
            int frequency = map.get(ch);
            if (arr[frequency] == null) {
                arr[frequency] = new ArrayList<>();
            }
            arr[frequency].add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                for (char c : arr[i]) {
                    for (int j = 0; j < map.get(c); j++) {

                        sb.append(c);
                    }
                }
            }
        }
        System.out.println(sb);              // Your code here
    }
}
