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

ll t,x,y, n,maxn, k, m, tc,d,l , r, a, b, ans, c, i,j,q ,val,z, sum, e, f, g, h, mx;
string s1, s2, s3;

int prime[1000005] = {0};

void sieve() {
    prime[1] = 1;
    int i = 2;
    while(i * i < 1000005) {
        if(prime[i] == 0) {
            k = i;
            while(i * k < 1000005) {
                prime[i * k] = 1;
                k++;
            }
        }
        i++;
    }
}

int main() {

    #ifdef LOCAL_JUDGE  
    freopen("Error.txt", "w", stderr);
    #endif
    fastio();
    sieve();
    read(t);
    while(t--) {
        read(n);
        read(e);  
        vector<ll> vec(n+1, 0);
        for(i=1;i<=n;i++) {
            cin >> vec[i];
        }
        ans = 0;
        for(i = 1; i <= n;i++) {
            if(!prime[vec[i]]) {
                long long ansr = 0;
                long long val = vec[i];
                for(k = 1; i + (e * k) <= n;k++) {
                    if(val == 1 && vec[i + (k * e)] == 1) {
                        continue;
                    } else if(val == 1 && vec[i + (k * e)] != 1) {
                        if(!prime[vec[i + (k * e)]]) {
                            ansr++;
                        }
                        val = vec[i + (k * e)];
                    } else if(val != 1 && vec[i + (k*e)] == 1){
                        if(!prime[val]) {
                            ansr++;
                        }
                    } else {
                        break;   
                    }
                }
                val = vec[i];
                long long ansl = 0;
                for(k = 1; i - (e * k) >= 0;k++) {
                    if(val == 1 && vec[i - (k * e)] == 1) {
                        continue;
                    } else if(val == 1 && vec[i - (k * e)] != 1) {
                        if(!prime[vec[i - (k * e)]]) {
                            ansl++;
                        }
                        val = vec[i - (k * e)];
                    } else if(val != 1 && vec[i - (k*e)] == 1){
                        if(!prime[val]) {
                            ansl++;
                        }
                    } else {
                        break;   
                    }
                }
                ans += ansl + ansr + (ansl > 0 && ansr > 0 ? ansl * ansr : 0 );
            }
        }
        pute(ans);
    } 
    return 0;    
}