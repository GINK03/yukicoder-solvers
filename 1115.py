
N=int(input())
*A,=map(int,input().split())
*B,=map(int,input().split())
B={b:i+1 for i, b in enumerate(B)}
A=[B[a] for a in A]


class BIT:
    def __init__(self, N):
        self.data = [0]*(N+1)
    def add(self, k, x):
        data = self.data
        while k <= N:
            data[k] += x
            k += k & -k
    def get(self, k):
        data = self.data
        s = 0
        while k:
            s += data[k]
            k -= k & -k
        return s
b = BIT(N=N)

ans = 0
for i, a in enumerate(A):
    # 自分より小さい要素がいくつ存在するかを計算
    ans += (N-1-i) - b.get(a)
    b.add(a, 1)
print(ans) # 2
