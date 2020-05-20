import math

d1,d2=map(int,input().split())

if d1 == d2 or 2*d1 == d2:
    print(4)
elif d1 < d2 and d2 < 2*d1:
    print(8)
else:
    print(0)
