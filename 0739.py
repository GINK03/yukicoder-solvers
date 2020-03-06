import sys
import os

xs = input()
size = len(xs)
left, right = xs[:size//2], xs[size//2:]

#print(left, ' ', right)

if left == right:
	print('YES')
else:
	print('NO')
