/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <bits/stdc++.h>
#include <string.h>

using namespace std;

int main()
{
    int t, n, m;
    cin >> t;
    while(t > 0) {
        cin >> n;
        int r[n];
        int ans1 = 0;
        int sum = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            cin >> r[i];
        }
        
        cin >> m;
        int b[m];
        for(int j=0;j<m;j++){
            cin >> b[j];
        }
        
        for(int i=0;i<n;i++){
            sum += r[i];
            ans = max(ans, sum);
        }
        sum = 0;
        for(int i=0;i<m;i++){
            sum += b[i];
            ans1 = max(ans1, sum);
        }
        cout << (ans + ans1) << endl;;
        t--;
    }

    return 0;
}