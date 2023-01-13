/*
Tic Tac Toe
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
Game is played in pairs.
If Rick plays against anyone, Rick wins.
If Jerry plays against anyone, Jerry Loses.
A game between any other players is a draw.
Given a pair of players, find who wins the game or if the game is draw.
Input
Input Contains two space separated characters denoting the players that will have the match.
R denotes Rick.
J denotes Jerry.
B denotes Beth.
M denotes Morty.
S denotes Summer.
Output
If the game is draw print 'D', else print the first letter of the name of the player who wins in capital.
Example
Sample Input 1
R S

Sample Output 1
R

Sample Input 2
B J

Sample Output 2
B

Sample Input 3
M S

Sample Output 3
D
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        if(a=='R' || b=='R'){
            System.out.println('R');
        }
        else if(a=='J'&& b=='B'|| a=='B' && b=='J'){
            System.out.println('B');
        }
        else if(a=='J' && b=='M'|| a=='M' && b=='J'){
            System.out.println('M');
        }
        else if(a=='J' && b=='S'|| a=='S' && b=='J'){
            System.out.println('S');
        }
        else if(a=='B' && b=='M'|| a=='M' && b=='B'){
            System.out.println('D');
        }
        else if(a=='M' && b=='S'|| a=='S' && b=='M'){
            System.out.println('D');
        }
        else if(a=='S' && b=='B'|| a=='B' && b=='S'){
            System.out.println('D');
        }

    }
}
