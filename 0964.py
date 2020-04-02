import os

n = int(input())
if n == 1:
    print(1)
else:
    a = ''.join([str(i)*n for i in list(range(n))[::-1]])
    print(a)
