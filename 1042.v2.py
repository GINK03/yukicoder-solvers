import math
p,q=map(int,input().split())


def f(x):
    return x**2 - q*x*math.log2(x) - p

l,r = 0, 10**11
x = 0
for _ in range(128):
    x = (l+r)/2
    if f(x) >= 0:
        r = x
    else:
        l = x
    # print(x)
print(x)

    

