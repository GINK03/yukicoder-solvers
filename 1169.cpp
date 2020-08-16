#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int get(int i, int j, int n) {
  int tmp = ((2*i - j) + n)%n;
  if(tmp == 0) return n;
  else return tmp;
}
int main() {
  int n;
  cin >> n;
  for(int i=1; i<=n; i++) {
	for(int j=1; j<=n; j++) {
	  cout << get(i,j,n) << " ";
	}
	cout << endl;
  }
}
