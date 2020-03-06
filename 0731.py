import numpy as np

def solve(n, qs):
    res = np.polyfit(list(range(n)), qs, 1, full=True)
    return res[0][1], res[0][0], res[1][0]
    


n = int(input())
qs = [int(q) for q in input().split()]
b0, d, cost = solve(n, qs)
print(f"{b0:.12f} {d:.12f}")
print(f"{cost:.12f}")

