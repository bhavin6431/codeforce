#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int n, t;
    string s;
    cin >> t;
    while(t--) {
        cin >> n;
        cin >> s;
        int li = -1;
        for(int i=0;i<n;i++){
            if(s[i] == '0') {
                li = i;
                break;
            }
        }
  
        if(li == -1) {
            cout << 1 << " " << n/2 << " " << 2 << " " << n/2 + 1;
        } else if(li < ceil((n * 1.0) /2)) {
            cout << li + 1 << " " << n << " " << li+2 << " " << n;
        } else {
            cout << 1 << " " << li + 1 << " " << 1 << " " << li;
        }
        cout << endl;
    }
    
}