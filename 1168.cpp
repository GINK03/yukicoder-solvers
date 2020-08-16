#include <iostream>
#include <string>
using namespace std;


int main() {
    // cout << "aaa" << endl;
    int x;
    cin >> x;
    string x2 = to_string(x);
    for(int i=1; i <= 100; i++) {

        int tmp = 0;
        for(char& c: x2) {
            tmp += int(c) - '0';
        }
        x2 = to_string(tmp);
    }
    cout << x2 << endl;
}
