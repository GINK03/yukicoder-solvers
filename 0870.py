N = int(input())

m1 = [(7,9),]
m2 = [(2,8),]
m3 = [(3,9),]

for n in range(N):
    x1, x2, x3, x4 = map(int, input().split())
    key = (x1, x2)
    val = (x3, x4)
    for m in [m1, m2, m3]:
        if m[-1] == key:
            m.append(val)

#for m in [m1, m2, m3]:
#    print(m)

if m1[-1] == (6,8) and m2[-1] == (5,8) and m3[-1] == (4,8):
    print('YES')
else:
    print('NO')