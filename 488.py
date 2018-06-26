n, m = map(int, input().split())
g = [ [ False for _ in range(n) ] for _ in range(n) ]
for _ in range(m):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    g[a][b] = g[b][a] = True
cnt = 0
for a in range(n):
    for b in range(a):
        for c in range(b):
            for d in range(c):
                for i, j, k, l in [ (a,b,c,d), (a,c,b,d), (a,c,d,b) ]:
                    if g[i][j] and g[j][k] and g[k][l] and g[l][i] and not g[i][k] and not g[j][l]:
                        cnt += 1
print(cnt)
