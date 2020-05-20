N,K=map(int,input().split())
import copy
S=list(input())

"""
# 愚直のコードで一般化した法則を見つけるための試行錯誤とする
S2 = copy.copy(S)
s=[0]*N
for i in range(0,N-K+1):
    for k, c in enumerate(reversed(list(S2[i:i+K]))):
        S2[i+k] = c
        s[i+k] += 1

print('S2', S2)
print('s', s)
"""


shift = K-1
# print(shift)

if (N - K)%2 == 0:
    a="".join(S[shift:]) + "".join(reversed(S[:shift]))
else:
    a="".join(S[shift:]) + "".join(S[:shift])
print(a)
#print(list(a) == S2)
