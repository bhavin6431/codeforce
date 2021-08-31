/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <bits/stdc++.h>
#include <string.h>

using namespace std;
bool p[10000000];

void prime() {
    int i = 2;
    while(i * i < 10000000) {
        if(!p[i]){
            int k = i * i;
            while(k < 10000000) {
                p[k] = true;
                k += i;
            }
        }
        i++;
    }
}
int findNextPrime(int n) {
    for(int i=n;i<10000000;i++){
        if(!p[i]) {
            return i;
        }
    }
}

int main()
{
    int t;
    cin >> t;
    prime();
    while(t > 0) {
    int d;
    cin >> d;

    int s = 1 + d;
    int f1 = findNextPrime(s);
    int f2 = findNextPrime(f1 + d);
    
    cout << f1 * f2 << endl;
    t--;
        
    }
    return 0;
}