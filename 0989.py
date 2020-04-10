import numpy as np
import bisect
n, m, k = map(int, input().split())

x1 = list(input().split())

op = x1.pop(0)

b_arr = list(map(lambda x:int(x), x1))
b_arr.sort()
a_arr = [int(input()) for i in range(n)]
a_arr.sort()

cnt = 0
if op == '+':
    for b in b_arr:
        s = k-b
        idx = bisect.bisect_left(a_arr, s)
        cnt += n -idx
else:
    for b in b_arr:
        s = k/b
        idx = bisect.bisect_left(a_arr, s)
        cnt += n -idx
print(cnt)
