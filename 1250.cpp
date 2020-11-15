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
  int N, H;
  cin >> N >> H;
  vector<int> A = vector<int>(N, 0);

  ll p = 1;
  for(int i=0; i<N; i++) {
	ll tmp;
	cin >> tmp;
	p = (p*tmp)%H; 
  }
  //cout << p << endl;
  if(p==0) cout << "YES" << endl;
  else cout << "NO" << endl;
}
