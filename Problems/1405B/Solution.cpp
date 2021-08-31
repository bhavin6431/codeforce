#include <bits/stdc++.h>
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
using namespace std;

long long dp[1000005][2];

int main()
{
    fast_io;
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        int a[n];
        for(int i=0;i<n;i++) {
            cin >> a[i];
        }
        long long pos = 0;
        long long neg = 0;
        for(int i=0;i<n;i++) {
            if(a[i] > 0) {
                pos+=a[i];
            } else if(a[i] < 0){
                pos = pos + a[i];
                if(pos < 0) {
                    neg+= pos;
                    pos = 0;
                }
            }
        }
        cout << abs(0 -neg) << endl;
    }
}