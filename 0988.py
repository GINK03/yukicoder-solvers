import numpy as np
n,m,k = map(int, input().split())
l1 = input().split()
op = l1.pop(0)

bs = np.array(list(map(int, l1))) % k

ax = np.array([int(input()) for a in range(n)]) % k
if op == '+':
    print( (bs.sum() * n  + ax.sum() * m) % k)
else:
    x = ((bs.sum()%k) * (ax.sum()%k))%k
    print(x)
