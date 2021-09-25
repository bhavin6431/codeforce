#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;

    while(t--) {
        string s;
        int l;
        cin >> l;
        cin >> s;
        for(int i=0;i<l;i++) {
            cout << (s[i] == 'D' ? 'U' : (s[i] == 'U' ? 'D' : s[i])) ;
        }
        cout << endl;
    }
    return 0;
}