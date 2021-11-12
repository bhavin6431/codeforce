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
typedef long long int lli;
typedef unsigned long long ull;
typedef long double lld;
typedef pair<int,int> pii;
#ifdef LOCAL_JUDGE
#define debug(x) cerr << #x <<" "; _print(x); cerr << endl;
#else
#define debug(x)
#endif

void _print(ll t) {cerr << t;}
void _print(int t) {cerr << t;}
void _print(string t) {cerr << t;}
void _print(char t) {cerr << t;}
void _print(lld t) {cerr << t;}
void _print(double t) {cerr << t;}
void _print(ull t) {cerr << t;}
template<typename... T>
void put(T&&... args) { ((cout << args), ...);}
template<typename... T>
void puts(T&&... args) { ((cout << args << " "), ...);}
template<typename... T>
void pute(T&&... args) { ((cout << args << endl), ...);}
#define putc(f) cout << (f ? "YES" : "NO") <<endl;

#define ff first
#define ss second


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
#define loop(i, s, e) for(i=s;i<e;i++)
#define loopr(i, s, e) for(i=e;i>=s;i--)
#define read(a) cin >> a
#define read3(a,b,c) cin >> a >> b >> c;
#define read2(a,b) cin >> a >> b;
#define read_array(a, n) loop(n) {cin >> a[i];}
#define read_vector_l(v, n) loop(i, 0, n) { ll val; cin >> val; v.pb(val);};
#define read_vector_i(v, n) loop(i, 0, n) { int val; cin >> val; v.pb(val);};
#define read_arrays(a, n, s) loops(n, s) {cin >> a[i];}
#define p_m(m, r, c) loop(i, 0, r) { loop(j, 0, c) {cout << m[i][j] << " ";} cout  << endl;} cout << endl;
#define p_a(m, n) loopi(n)  {p(m[i]); p(" ");}
#define map_insert(m, a, b) m.insert({a,b})
#define map_erase(m, a) m.erase(a)
#define stricklyLess(values, key) upper_bound(values.begin(), values.end(), key, greater<int>()); 
#define loopm(map) for(auto it = map.begin(); it != map.end();it++)
#define MOD 1000000007
#define INF 1e18
#define mp make_pair
#define pb push_back
#define g_p(tc, t, ans) cout << "Case #" << (tc-t) << ": " << ans << endl;
#define g_p_s(t, ans) cout << "Case #" << t << ": " << ans << endl;

ll t,x,y, n,maxn, k, m, tc,d,l , r, a, b, ans, c, i,j,q ,val,z;
string s1, s2;

int main() {

    #ifdef LOCAL_JUDGE
    freopen("Error.txt", "w", stderr);
    #endif
    fastio();
    read(n);
    map<int, string> m;
    m.insert({0, "zero"});
    m.insert({1, "one"});
    m.insert({2, "two"});
    m.insert({3, "three"});
    m.insert({4, "four"});
    m.insert({5, "five"});
    m.insert({6, "six"});
    m.insert({7, "seven"});
    m.insert({8, "eight"});
    m.insert({9, "nine"});
    m.insert({10, "ten"});
    m.insert({11, "eleven"});
    m.insert({12, "twelve"});
    m.insert({13, "thirteen"});
    m.insert({14, "fourteen"});
    m.insert({15, "fifteen"});
    m.insert({16, "sixteen"});
    m.insert({17, "seventeen"});
    m.insert({18, "eighteen"});
    m.insert({19, "nineteen"});

    m.insert({20, "twenty"});
    m.insert({30, "thirty"});
    m.insert({40, "forty"});
    m.insert({50, "fifty"});
    m.insert({60, "sixty"});
    m.insert({70, "seventy"});
    m.insert({80, "eighty"});
    m.insert({90, "ninety"});

    if(m.count(n) > 0) {
        cout << m[n];
    } else {
        int unit = n % 10;
        int tens = n - (n % 10);
        cout << m[tens] << "-" << m[unit];
    }
    return  0;    
}