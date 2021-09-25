#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main() {
    int t,n;
    cin >> t;
    while(t--) {
        
    cin >> n;
    int c1 = 0;
    int c2 = 0;
    vector<int> w; 
    for(int i=0;i<n;i++){
        char val;
        cin >> val;
        if(val == '1') {
            c1++;
        } else {
            c2++;
            w.push_back(i);
        }
    }
    
    char mat[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            mat[i][j] = ' ';
        }    
    }
    if(c2 == 0) {
        cout << "YES" << endl; 
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(i == j) {
                    cout << 'X';
                } else {
                    cout << '=';
                }
            }
            cout << endl;
        }
    }
    else if(c2 > 2) {
        cout << "YES" << endl; 
        
        for(int i=0;i<w.size() - 1;i++) {
            mat[w[i]][w[i+1]] = '+';
            mat[w[i+1]][w[i]] = '-';
        }
        mat[w[w.size() - 1]][w[0]] = '+';
        mat[w[0]][w[w.size() - 1]] = '-';
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i == j) {
                    cout << 'X';
                } else if(mat[i][j] == '+' || mat[i][j] == '-') {
                    cout << mat[i][j];
                } else {
                    cout << "=";
                }
            }
            cout << endl;
        }
        
    } else {
            cout << "NO" << endl;
        }
    }
}