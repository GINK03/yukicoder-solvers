

class UnionFind:
    def __init__(self, n):
        self.n = n
        self.parents = [-1] * n

    def find(self, x):
        if self.parents[x] < 0:
            return x
        else:
            self.parents[x] = self.find(self.parents[x])
            return self.parents[x]

    def union(self, x, y):
        x = self.find(x)
        y = self.find(y)

        if x == y:
            return

        if self.parents[x] > self.parents[y]:
            x, y = y, x

        self.parents[x] += self.parents[y]
        self.parents[y] = x

n = int(input())
uf = UnionFind(n)

edges = [0]*n
for i in range(n-1):
    a, b = map(int, input().split())
    uf.union(a,b)
    edges[a] += 1
    edges[b] += 1

cluster_num = sum([1 for p in uf.parents if p < 0])
if 1 in edges:
    cluster_num += 1
if cluster_num != 1:
    cluster_num -= 1
if cluster_num == 1:
    print("Bob")
else:
    print("Alice")
