A,B=map(int,input().split())
import math

for i in range(B, A+1):
    if A%i == 0 and i%B == 0:
        print('YES')
        exit()
print('NO')

