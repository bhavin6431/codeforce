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
#define p(x) cout << x;
#define p_e(x) cout << x << endl;
#define p_s(x) cout << x << " ";
#define p_t_s(x, y) cout << x << " " << y;
#define p_t_s_e(x, y) cout << x << " " << y << endl;
 
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
#define read_2(a,b) cin >> a >> b;
#define read_array(a, n) loop(n) {cin >> a[i];}
#define read_vector_l(v, n) loop(i, 0, n) { ll val; cin >> val; v.pb(val);};
#define read_vector_i(v, n) loop(i, 0, n) { int val; cin >> val; v.pb(val);};
#define read_arrays(a, n, s) loops(n, s) {cin >> a[i];}
#define p_m(m, r, c) loopi(r) { loopj(c) {p(m[i][j]); p(" ");} p_e("");}
#define p_a(m, n) loopi(n)  {p(m[i]); p(" ");}
#define map_insert(m, a, b) m.insert({a,b})
#define map_erase(m, a) m.erase(a)
#define loopm(map) for(auto it = map.begin(); it != map.end();it++)
#define MOD 1000000007
#define INF 1e18
#define mp make_pair
#define pb push_back
#define g_p(tc, t, ans) cout << "Case #" << (tc-t) << ": " << ans << endl;
#define g_p_s(t, ans) cout << "Case #" << t << ": " << ans << endl;
 
bool isSeq(string first, string second, string n) {
    auto x = n.find(first);
    auto x1 = n.find(second, x+1); 
    return x != string::npos && x1 != string::npos; 
}
 
bool hasValue(vector<int> f, char val) {
    return f[val - '1'] > 0;
}
 
bool hasValueMoreThanOne(vector<int> f, char val) {
    return f[val - '1'] > 1;
}
 
int main() {
 
    #ifdef LOCAL_JUDGE
    freopen("Error.txt", "w", stderr);
    #endif
    fastio();
    int t;
    read(t);
    while(t--) {
 
        int ans, k, i;
        string n;
        vector<int> f(9, 0);
        read(k);
        read(n);
        loop(i, 0, k) {
            f[n[i] - '1']++;
        }
 
        if(hasValue(f, '1')) {
            p_e(1);
            p_e(1);
            continue;
        }
        
        if(hasValue(f, '4')) {
            p_e(1);
            p_e(4);
            continue;
        }
        
        if(hasValue(f, '6')) {
            p_e(1);
            p_e(6);
            continue;
        }
        
        if(hasValue(f, '8')) {
            p_e(1);
            p_e(8);
            continue;
        }
        
        if(hasValue(f, '9')) {
            p_e(1);
            p_e(9);
            continue;
        }
        
        if(hasValueMoreThanOne(f, '2')) {
            p_e(2);
            p_e(22);
            continue;
        }
        
        if(hasValueMoreThanOne(f, '3')) {
            p_e(2);
            p_e(33);
            continue;
        }
    
        if(hasValueMoreThanOne(f, '5')) {
            p_e(2);
            p_e(55);
            continue;
        }
        
        if(hasValueMoreThanOne(f, '7')) {
            p_e(2);
            p_e(77);
            continue;
        }
        
        if(hasValue(f, '2') && hasValue(f, '3') && isSeq("3", "2", n)) {
            p_e(2);
            p_e(32);
            continue;
        }
        //isSeq("", "", n)
        if(hasValue(f, '2') && hasValue(f, '5')) {
            if(isSeq("2", "5", n)) {
                p_e(2);
                p_e(25);
                continue;
            } else {
                p_e(2);
                p_e(52);
                continue;
            }
        }
        
        if(hasValue(f, '2') && hasValue(f, '7') ) {
            if(isSeq("2", "7", n)) {
                p_e(2);
                p_e(27);
                continue;
            } else {
                p_e(2);
                p_e(72);
                continue;
            }
        }
        
        if(hasValue(f, '3') && hasValue(f, '5')) {
            if(isSeq("3", "5", n)) {
                p_e(2);
                p_e(35);
                continue;
            } 
        }
        
        if(hasValue(f, '5') && hasValue(f, '7')) {
            if(isSeq("5", "7", n)) {
                p_e(2);
                p_e(57);
                continue;
            } else {
                p_e(2);
                p_e(75);
                continue;
            }
        }
    }
return 0;
}   