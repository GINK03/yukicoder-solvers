a, b, x, n = map(int, input().split())

cycle = []
for i in range(6):
    x_next = a*x + b
    x = x_next
    print(i+1, x%6+1)
    cycle.append(x%6+1)
n *= 2
chunk_num = n // 6
from collections import Counter
def calc_point(cycle, chunk_num):
    a = [c for c in [cycle[0], cycle[2], cycle[4]]]
    a = dict(Counter(a))
    b = [c for c in [cycle[1], cycle[3], cycle[5]]]
    b = dict(Counter(b))
    
    for p in [a,b]:
        for k in list(p.keys()):
            p[k] *= chunk_num
    amari_ = n % 6
    for i in range(amari_+1):
        if i%2 == 0:
            a[cycle[i]] += 1
        else:
            b[cycle[i]] += 1
    print(a, b, chunk_num, cycle)

calc_point(cycle, chunk_num)
