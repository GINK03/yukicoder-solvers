import numpy as np

n = int(input())

ps = []
Xs = []
for i in range(n):
    xs = list(map(int,input().split()))
    Xs.append(xs)
    ps.append(xs.pop(0))

p_max = max(ps)
#print(p_max)

b = np.zeros((n, p_max)).astype(np.int)
#print(b)

for i, xs in enumerate(Xs):
    for k, x in enumerate(xs):
        b[i, k] = x
    
#print(b)

a = ' '.join([str(x) for x in b.T.flatten().tolist() if x!=0])
print(a)
