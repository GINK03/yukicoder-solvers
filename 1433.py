import collections
N=int(input())
S=input()
*A,=map(int,input().split())

cs = [0]
for i in range(N):
    if S[i] == "B":
        A[i] = -A[i]
    cs.append(cs[-1] + A[i])
print(abs(max(cs) - min(cs)))

"""
RB = collections.namedtuple("RB", ["r", "b"])
cs = [RB(0,0)]
for i in range(N):
    if S[i] == "R":
        cs.append( RB(cs[-1].r + A[i], cs[-1].b) )
    else:
        cs.append( RB(cs[-1].r, cs[-1].b + A[i]) )
print(cs)
"""
