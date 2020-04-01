

ax = sorted(map(int, input().split()))

a1 = ax[-1]
a2 = ax[-2]
a3 = ax[-3]

print(min((a1 - a2), (a2 - a3)))

