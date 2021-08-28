/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    long long t;
    cin >> t;
    while(t--) {
    long long a, b, ans = 1e18, count;
    cin >> a >> b;
    for(long long i = 0; i * i <= a; i++) {
        if(b == 1 && i == 0) 
            continue;
        count = i;
        
        long long c = a;
        while(c) {
            c /= (b + i);
            count++;
        }
        ans = min(ans, count);
    }
    cout << ans << endl;
    }
    return 0;
}