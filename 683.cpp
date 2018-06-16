#include <iostream>
using namespace std;
long grad(long a, long b) {
    if( a == 0 && b == 0) return 1;
    else if( a == 0) return 1;
    else if( b == 0) return 1;
    else if( a%2 == 1 && b%2 == 1 ) return 0;
    else if( a%2 == 0 && b%2 == 0 ) return grad(a-1, b/2) or grad(a/2, b-1);
    else if( a%2 == 1L ) return grad(a-1, b/2);
    else if( b%2 == 1L ) return grad(a/2, b-1);

    return 0;
}

int main() {
  long a, b;
  cin >> a; 
  cin >> b;
  if( grad(a, b) == 1 ) 
    cout << "Yes" << endl;
  else
    cout << "No" << endl;
}
