#include <iostream>
#include <cmath>
#include <set>
#include <string>
using namespace std;
using ll = long long;

int main() {
	int N,D;
	cin >> N; cin >> D;
	int xs[N] = {};
	int vs[N] = {};

	int total_v = 0;
	for(int i=1;i<=N;i++) 
	  cin >> xs[i];
	for(int i=1;i<=N;i++) { 
	  cin >> vs[i]; 
	  total_v += vs[i];
	}
  

	double a = double(D)/total_v;
	if(a == int(a)) {
	  cout << int(a) << endl;
	} else {
	  cout << int(a)+1 << endl;
	}
	return 0;
}
