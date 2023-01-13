/*
Closest Buddy (Contest)
medium

Time Limit: 2 sec
Memory Limit: 512000 kB
Problem Statement
You are given an integer array A of size N. For each index i (1 <= i <= N), you need to find an index j, such that gcd(A[i], A[j]) = 1, and abs(i-j) is the minimum possible. If there are two values of j satisfying the condition, report the minimum one. If there is no possible value of j, report -1.

Note: gcd(x, y) represents the the greatest common divisor of integers x and y, while abs(i- j) represents the absolute value of (i-j). Eg: gcd(6, 15) = 3 ; abs(6-15) = 9.

See sample for better understanding.
Input
The first line of the input contains a single integer N.
The next line of the input contains N space separated integers, the elements of the array A.

Constraints
1 <= N <= 200000
1 <= A[i] <= 50
Output
Output N space separated integers, the value of j corresponding to each index. If there is no possible value of j, report -1 instead.
Example
Sample Input
5
1 2 4 3 9

Sample Output
1 1 4 3 3

Explanation
For index 1, gcd(A[1], A[1]) = 1, and abs(1-1) = 0.
For index 2, gcd(A[2], A[1]) = 1, and abs(2-1) = 1. gcd(A[2], A[4) is also equal to 1, but abs(2-4) = 2, which is a greater value.
Similarly for index 3, 4, and 5, gcd(A[3], A[4]) = 1, gcd(A[4], A[3]) = 1, and gcd(A[5], A[3]) = 1.

Sample Input
5
3 3 2 3 3

Sample Output
3 3 2 3 3

Sample Input
5
3 21 7 7 21

Sample Output
3 -1 1 1 -1
*/


#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

 #define sd(x) scanf("%d", &x)
 #define sz(v) (int) v.size()
 #define pr(v) For(i, 0, sz(v)) {cout<<v[i]<<" ";} cout<<endl;
 #define slld(x) scanf("%lld", &x)
 #define all(x) x.begin(), x.end()
 #define For(i, st, en) for(int i=st; i<en; i++)
 #define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
 #define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
 #define pb push_back
 #define fun_main main
 #define ll long long
 #define ld long double
 #define double long double
 #define mp make_pair
 #define F first
 #define S second
 typedef pair<int, int> pii;
 typedef vector<int> vi;
 #define pi 3.141592653589793238
 const int MOD = 1e9+7;
 const int N = 2e5+5;
 int pre[N][55], suf[N][55];
 int arr[N];
 void solve(){
     int n; cin>>n;
     For(i, 1, n+1){
         cin>>arr[i];
     }
     For(i, 1, n+1){
         For(j, 1, 51){
             if(arr[i]==j)
                 pre[i][j]=i;
             else
                 pre[i][j]=pre[i-1][j];
         }
     }
     for(int i=n; i>=1; i--){
         For(j, 1, 51){
             if(arr[i]==j){
                 suf[i][j]=i;
             }
             else{
                 suf[i][j]=suf[i+1][j];
             }
         }
     }
     vector<int> ans(n+1, -1);
     For(i, 1, n+1){
         int dist = 3e5;
         For(j, 1, 51){
             if(__gcd(arr[i], j)==1){
                 if(pre[i][j] && abs(i-pre[i][j])<=dist){
                     ans[i]=pre[i][j];
                     dist=abs(i-pre[i][j]);
                 }
                 if(suf[i][j] && abs(i-suf[i][j])<dist){
                     ans[i]=suf[i][j];
                     dist=abs(i-suf[i][j]);
                 }
             }
         }
     }
     set<int> s;
     For(i, 1, n+1){
         s.insert(ans[i]);
         cout<<ans[i]<<" ";
     }
 }
 signed fun_main()
 {
         solve();
 }
