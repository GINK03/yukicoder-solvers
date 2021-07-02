

N,M=map(int,input().split())

G = [[float('inf')]*N for _ in range(N)]

for m in range(M):
    s,t,d=map(int, input().split())
    s-=1; t-=1
    G[s][t] = min(d, G[s][t])

# 同じノード上の距離は0とする
for i in range(0, N):
    G[i][i] = 0

# ワーシャルフロイド法
for k in range(0, N):
    for x in range(0, N):
        for y in range(0, N):
            G[x][y] = min(G[x][y], G[x][k] + G[k][y])


for i in range(N):
    ans = sum([G[i][j] if G[i][j] != float('inf') else 0 for j in range(N)])
    print(ans)
