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
    string s1, s2;
    cin >> s1;
    cin >> s2;
    if(s1 == s2) {
	cout << -1 << endl;
    } else {
 	cout << max(s1.length(), s2.length());    
   }
       return 0;
}