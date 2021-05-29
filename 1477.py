import collections

N, M = map(int, input().split())
A = list(map(lambda x: int(x) - 1, input().split()))

G = collections.defaultdict(set)

for _ in range(M):
    v0, v1 = map(lambda x: int(x) - 1, input().split())
    # 計算量の削減
    if A[v0] < A[v1]:
        G[v0].add(v1)
    else:
        G[v1].add(v0)

K = int(input())
B = set(map(lambda x: int(x) - 1, input().split()))

onoff = [int(gi in B) for gi in range(N)]
greedy = [(A[ai], ai) for ai in range(N)]
greedy.sort()

ans = []
for a, gi in greedy:
    if onoff[gi] != 1:
        continue
    onoff[gi] = 0
    ans.append(gi)
    for ri in G[gi]:
        if A[ri] > a:
            onoff[ri] ^= 1

if sum(onoff) > 0:
    print(-1)
else:
    print(len(ans))
    print(*map(lambda x: x + 1, ans), sep='\n')
