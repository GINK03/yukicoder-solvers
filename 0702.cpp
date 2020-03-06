#include <iostream>

using namespace std;

uint32_t x = 0, y = 1, z = 2, w = 3;
uint32_t generate() { 
    uint32_t t = (x^(x<<11));
    x = y;
    y = z;
    z = w;
    w = (w ^ (w >> 19)) ^ (t ^ (t >> 8)); 
    return w;
}

int main(void) {
    cout << "aaa" << endl;
    int64_t seed; cin >> seed; 
    x = seed;
    uint32_t a[11];
    for (int i = 0; i < 11; i++) {
        a[i] = generate();
    }
    for (int i = 0; i < 11; i++) {
        cout << a[i] << endl;
    }
    return 0;
}
