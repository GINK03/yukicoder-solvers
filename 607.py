import sys
N, M = map(int, input().split())
a = [0] * N
for l in sys.stdin.readlines():
    a = [n+m for n, m in zip(a, map(int, l.split()))]+[0]
    i, j, total = 0, 1, a[0]
    while j <= N:
        if total == 777:
            print("YES")
            exit()
        if total < 777:
            total += a[j]
            j += 1
        else:
            total -= a[i]
            i += 1
print("NO")
