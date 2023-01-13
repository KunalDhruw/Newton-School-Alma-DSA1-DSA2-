/*
Pizza Delivery (Contest)
hard

Time Limit: 2.5 sec
Memory Limit: 128000 kB
Problem Statement
There are N pizza delivery people, they need to deliver pizzas to M customers in the town. The town is a straight line, and all the above N + M people are at distinct positions in it. The initial position of i-th pizza delivery person is Pi and the initial position i-th person to whom pizza should be delivered is Qi.
Every second, every pizza delivery person can move one unit to either the left or right, or remain stationary. Multiple pizza delivery people are permitted to occupy the same position. When a pizza delivery person occupies the same position as a customer, they can spend 0 seconds to deliver the pizza to the person.

Find the minimum time (in seconds) required to deliver pizzas to all the customers.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N integers, the initial positions of the pizza delivery people.
The third and the final line of input contains M integers, the initial positions of the customers.

Constraints
1 <= N <= 200000
1 <= M <= 200000
1 <= Pi, Qi <= 500,000,000
Output
Output a single integer, the minimum time required to deliver all pizzas.
Example
Sample Input
2 2
10 20
13 16

Sample Output
4

Explanation: The 1st pizza delivery person delivers to 1st customer in 3 sec while the 2nd delivery person delivers the pizza to 2nd customer in 4 sec.

Sample Input
2 2
10 20
17 18

Sample Output
3

Explanation: The 2nd delivery person delivers to both customers.

Sample Input
3 3
20 60 30
25 10 35

Sample Output
15

Sample Input
2 3
20 80
10 21 81

Sample Output
12
*/


#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define sd(x) scanf("%d",&x)
#define sz(v) (int) v.size()
#define pr(v) For(i, 0, sz(v)) {cout<<v[i]<<" ";} cout<<endl;
#define slld(x) scanf("%lld", &x)
#define all(x) x.begin(), x.end()
#define For(i, st, en) for(int i=st; i<en; i++)
#define tr(x) for(auto it=x.begin(); it!=x.end(); it++)
#define fast std::ios::sync_with_stdio(false);cin.tie(NULL);
#define pb push_back
#define ll long long
#define ld long double
#define int long long
#define double long double
//
#define F first
#define S second
typedef pair<int, int> pii;
typedef vector<int> vi;
#define pi 3.141592653589793238
const int  MOD = 1e9+7;
const int INF = 1LL<<60;


const int N = 2e5+5;

//

#ifdef SWAPNIL07
#define trace(...) __f(#__VA__ARGS__, __VA_ARGS__)
template <typename Arg1>
void __f(const char* name, Arg1&& arg1){
  cout << name << " : " << arg1 << endl;
}
template <typename Arg1, typename... Args>
void __f(const char* names, Arg1&& arg1, Args&&... Args>){
  const char* comma = strchr(names + 1, ',');cout.write(names, comma - names) << " : " << arg1<<" | ";__f(comma+1, args...);
}
int begtime = clock();
#define end_routine() cout << "\n\nTime elapsed: " << (clock() - begtime)*1000/CLOCKS_PER_SEC << " ms\n\n";
#else
#define endl '\n'
#define trace(...)
#define end_routine()
#endif

int n, m, k, s;
vector<int> p, q;

bool ch(int x){
  int j = 0;
  For(i, 0, n){
    int cur = x;
    if(p[i] - q[j] > cur)
    return false;
    if(q[j] < p[i]){
      int d = p[i]-q[j];
      cur = max(cur-2*d, (cur-d)/2);
      for(; j<m; j++){
        if(q[j] > p[i])
        break;
      }
    }
    for(; j<m; j++){
      int d = q[j]-p[i];
      if(d > cur)
      break;
    }
    if(j == m){
      return true;
    }
  }
  return false;
}

void solve(){
  cin>>n>>m;
  p.resize(n);
  q.resize(m);
  For(i, 0, n){
    cin>>p[i];
  }
  For(i, 0, m){
    cin>>q[i];
  }
  sort(all(p));
  sort(all(q));
  int low = 0;
  int high = 1000000001;
  while(high > low){
    int mid = (low+high)>>1;
    if(ch(mid))
    high = mid;
    else
    low = mid + 1;
  }
  cout<<low;

}


signed main() 
{
    fast
    #ifdef SWAPNIL07
        freopen("inpit.txt","r",stdin);
        freopen("output.txt","w",stdout);
        #endif
        int t = 1;
        //
        for(int i = 1; i<=t; i++){
          solve();
          cout<<"\n";
        }
        return 0;
}
