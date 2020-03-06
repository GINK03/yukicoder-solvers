import math
N, D = map(int, input().split())


cnt1 = {}
for n1 in range(1, N+1):
    for n2 in range(1, N+1):
        v = n1**2 + n2**2
        if cnt1.get(v) is None:
            cnt1[v] = 0
        cnt1[v] += 1

cnt2 = {}
for n1 in range(1, N+1):
    for n2 in range(1, N+1):
        v = n1**2 - n2**2 + D
        if cnt2.get(v) is None:
            cnt2[v] = 0
        cnt2[v] += 1

same_keys = set(cnt1) & set(cnt2)
r = 0
for k in same_keys:
    r += cnt1[k] * cnt2[k]

print(r)
