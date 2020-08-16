#include <string>
#include <iostream>
#include <algorithm>
#include <cmath>
#include <set>
using namespace std;
using ll = long long;

ll gcd(long long a, long long b){
   if (a%b == 0)
       return(b);
   else
       return(gcd(b, a%b));
}

void solve(ll n) {
  ll a = sqrt(n);
  if(a*a == n) 
	cout << "Odd" << endl;
  else
	cout << "Even" << endl;
}

int main() {
  long long  a, b;
  cin >> a; cin >> b;
  //cout << gcd(a,b) << endl;
  solve(gcd(a,b));
  return 0;
}
