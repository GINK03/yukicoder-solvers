import os
import itertools
N, M, P, Q = map(int, input().split())

ruin = [M for i in range(12)]

for s in range(P-1, Q+P-1):
	ruin[s] *= 2

# print(ruin)
for index, e in enumerate(itertools.cycle(ruin)):
	N -= e
	if N <= 0:
		break

print(index+1)
