import math
p,q=map(int,input().split())

def f(x):
    return x*x - q*x*math.log2(x) - p

l,r=0,10**12
for _ in range(200):
    mid_x = (l+r)/2
    if f(mid_x) >= 0:
        r = mid_x
    else:
        l = mid_x

print(mid_x)

