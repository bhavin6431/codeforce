#include <iostream>

using namespace std;

// Method to calculate xor
int computeXOR(int n)
{
   
  // If n is a multiple of 4
  if (n % 4 == 0)
    return n;
 
  // If n%4 gives remainder 1
  if (n % 4 == 1)
    return 1;
 
  // If n%4 gives remainder 2
  if (n % 4 == 2)
    return n + 1;
 
  // If n%4 gives remainder 3
  return 0;
}

int main() {
    int t;
    cin >> t;

    while(t--) {
        int a,b;
        cin >> a;
        cin >> b;
        int ans = 0, x;
        x = computeXOR(a-1);
        cout << (x == b ? a : ((x ^ b) != a ? a + 1 : a + 2)) <<endl;
    }
    return 0;
}