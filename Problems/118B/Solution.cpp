#include <bits/stdc++.h>
#include <utility>
#include <math.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace std;
using namespace __gnu_pbds;
#define fastio() ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
 
template <typename T> 
using ordered_set = tree<T, null_type,less<T>, rb_tree_tag,tree_order_statistics_node_update>;
typedef long long ll;
typedef unsigned long long ull;
typedef long double lld;
typedef pair<int,int> pii;
#ifdef LOCAL_JUDGE
#define debug(x) cerr << #x <<" "; _print(x); cerr << endl;
#else
#define debug(x)
#endif
#define p(x) cout << x;
#define p_e(x) cout << x << endl;
#define p_s(x) cout << x << " ";
 
//fstream myfile("c:\\tmp\\in.txt", ios_base::in);
//myfile >> n;
//fstream mf("c:\\tmp\\out.txt", ios_base::out);
//mf << n;
 
void _print(ll t) {cerr << t;}
void _print(int t) {cerr << t;}
void _print(string t) {cerr << t;}
void _print(char t) {cerr << t;}
void _print(lld t) {cerr << t;}
void _print(double t) {cerr << t;}
void _print(ull t) {cerr << t;}
 
template <class T, class V> void _print(pair <T, V> p);
template <class T> void _print(vector <T> v);
template <class T> void _print(set <T> v);
template <class T, class V> void _print(map <T, V> v);
template <class T> void _print(multiset <T> v);
template <class T, class V> void _print(pair <T, V> p) {cerr << "{"; _print(p.ff); cerr << ","; _print(p.ss); cerr << "}";}
template <class T> void _print(vector <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(set <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(multiset <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T, class V> void _print(map <T, V> v) {cerr << "[ "; for (auto i : v) {_print(i); cerr << " ";} cerr << "]";}
#define loop(n) for(int i=0;i<n;i++)
#define loopr(n) for(int i=n-1;i>=0;--i)
#define loops(n, s) for(int i=s;i<n;i++)
#define loopi(n) for(int i=0;i<n;i++)
#define loopj(n) for(int j=0;j<n;j++)
#define loopjs(n, s) for(int j=s;j<n;j++)
#define read(a) cin >> a
    #define read_2(a,b) cin >> a >> b;
#define read_array(a, n) loop(n) {cin >> a[i];}
#define read_arrays(a, n, s) loops(n, s) {cin >> a[i];}
#define p_m(m, r, c) loopi(r) { loopj(c) {p(m[i][j]); p(" ");} p_e("");}
#define map_insert(m, a, b) m.insert({a,b})
#define map_erase(m, a) m.erase(a)
#define loopm(map) for(auto it = map.begin(); it != map.end();it++)
#define MOD 1000000007
#define INF 1e18
#define ff first
#define ss second
#define mp make_pair
const int MAXIN = 2e6;
int n,m, le, ri;
int dp[MAXIN];
 
int x[] = {0, 0, 1, -1};
int y[] = {1, -1, 0, 0};
bool v[19][19];
 
bool isValid(int i, int j, int d) {
    return i>=0 && i<d && j>=0 && j <d && !v[i][j];
}
struct node {
    int i, j, v;
};
 
int main() {
 
    #ifdef LOCAL_JUDGE
    freopen("Error.txt", "w", stderr);
    #endif
    fastio();
    read(n);
    int d = (2*n) + 1;
    int g[d][d];
    loop(d) {
        loopj(d) {
            g[i][j] = -1;  
        }
    }
    
    queue<node> q;
    q.push({n,n,n});
    g[n][n] = n;
    v[n][n] = true;
    while(!q.empty()){
        node n1 = q.front();
        q.pop();
        for(int i=0;i<4;i++) {
            if(isValid(n1.i + x[i],n1.j + y[i], d)) {
                g[n1.i + x[i]][n1.j + y[i]] = n1.v - 1;
                v[n1.i + x[i]][n1.j + y[i]] = true;
                q.push({n1.i + x[i], n1.j + y[i], n1.v -1});
            }
        }    
    }
   
    loop(d) {
         bool r = false;
            bool zs = false;
            if(i == 0 || i == d - 1) {
                zs = true;
            }
        loopj(d){
            if(g[i][j] < 0) {
                if(!r) {cout << "  ";}
            } else {
                cout << g[i][j] << (g[i][j] != 0 || !zs ? " " : "");
                r = true;
                if(g[i][j] == 0) {
                    zs = true;
                }
            }
        }
        cout << endl;
    }
}         