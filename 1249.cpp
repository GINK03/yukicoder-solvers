
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

  int A, B, C;
  cin >> A >> B >> C;

  if( A+B == C) {
	cout << "Correct" << endl; 
  } else {
	cout << "Incorrect" << endl;
  }
}
