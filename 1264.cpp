
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
  int N;
  cin >> N;
  string s = "";
  for(int i=0; i<N; i++)
	s += "0";
  
  cout << "01" << s << "1" << endl;
}

