
#include <iostream>
#include <algorithm>
#include <vector>
#include <bits/stdc++.h>

using namespace std;
using ll=long long;
const long long INF = 1LL << 60;
template<class T> void chmin(T& a, T b) { if(a > b) { a = b; } }
template<class T> void Sort(vector<T>& input) { std::sort(input.begin(), input.end()); }

int main() {

  int N, M;
  cin >> N >> M;
  vector<int> T = vector<int>(100000+10, 0);
  vector<int> P = vector<int>(100000+10, 0);
  
  for(int i=0; i<M; i++) {
	cin >> T[i] >> P[i];
  }

  for(int i=1; i<=M; i++) {
	if(abs(T[i] - T[i-1]) < abs(P[i] - P[i-1])) {
	  cout << "No" << endl;
	  return 0;
	}
  }
  cout << "Yes" << endl;
}
