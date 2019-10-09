import os
import math
T, A, B = map(int,input().split())
m1 = T//A if T%A == 0 else T//A + 1
m2 = T//B if T%B == 0 else T//B + 1
#print(math.gcd(m1, m2))
common = A*B//math.gcd(A, B) 
m3 = T//common if T%common == 0 else T//common + 1
#print(m1 + m2)
print(m1+m2-m3)
