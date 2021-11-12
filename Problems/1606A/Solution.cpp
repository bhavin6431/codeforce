#include <iostream>

using namespace std;

int t;
string st;
int main() {
    cin >> t;
    
    while(t--) {
        cin >> st;
        if(st.length() == 1 || st[0] == st[st.length() - 1]) {
            cout << st << endl;
        } else {
            cout << (st[0] == 'a' ? 'b' : 'a') << st.substr(1) << endl;
        }
    }
}