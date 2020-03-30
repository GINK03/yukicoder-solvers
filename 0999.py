N = int(input())

ax = list(map(int, input().split()))

rights = []
for i in range(0, N*2, 2):
    right = ax[i] - ax[i+1]
    rights.append(right)

lefts = []
for i in range(0, N*2, 2):
    left = ax[i+1] - ax[i]
    lefts.append(left)

a = 0
for i, r in enumerate(list(rights)):
    a += r
    rights[i] = a

a = 0
for i, l in enumerate(list(reversed(lefts))):
    a += l
    lefts[i] = a
lefts = list(reversed(lefts))
rights.insert(0, 0)
lefts.append(0)

print(max([r+l for r,l in zip(rights, lefts)]))
