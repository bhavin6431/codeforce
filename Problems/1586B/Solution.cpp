#include <iostream>
#include <bits/stdc++.h>

using namespace std;
int main() {
    int n,m, t;
    cin >> t;
    while(t--) {
    int a,b,c;
    cin >> n >> m;
    vector<int> v(n+1,0);
    for(int i=1;i<=m;i++) {
        cin>>a>>b>>c;
        v[b] = 1;
    }
    int ce = 0;
    for(int i=1;i<=n;i++) {
        if(v[i] == 0) {
            ce=i;
            break;
        }
    }
    for(int i=1;i<=n;i++) {
        if(i != ce) {
            cout << ce  << " " << i  <<endl; 
        }
    }
    }
}