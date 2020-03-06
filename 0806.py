

N = int(input())

buff = {}
for n in range(1, N+1):
    buff[n] = set()

for n in range(N-1):
    a, b = map(int, input().split())
    buff[a].add(b)
    buff[b].add(a)

change_num = 0
for key, vals in buff.items():
    if len(vals) >= 2:
        change_num += len(vals) - 2

#print(buff)
print(change_num)
