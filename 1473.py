

import collections
import heapq
import math

N,M=map(int,input().split())

G = collections.defaultdict(list)

for _ in range(M):
    S,T,D = map(int, input().split())
    G[S-1].append((T-1,D))
    G[T-1].append((S-1,D))

def bfs(max_w):
    que = collections.deque([(0,0)]) # index, something val
    visited = [-1]*N
    while que:
        i, c = que.popleft() # queはFIFO
        if visited[i] >= 0:
            continue
        visited[i] = c
        for j, d in G[i]:
            if visited[j] == -1 and max_w <= d: # まだ未踏のノードであれば
                que.append((j,c+1)) # 自分の値に+1してqueに入れる
    return visited[-1]

ok = 0
ng = 1 << 64
while(True):
    mid = (ok+ng) // 2
    if bfs(mid) != -1:
        ok = mid
    else:
        ng = mid
    if ng - ok == 1:
        break
print(ok, bfs(ok))
