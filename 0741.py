'''
000000000123456789から一つを選ぶ作業と等価
つまりN桁から、N+9 C 9を選ぶ作業と等しい
'''
import math
from functools import reduce
from operator import mul
N = int(input())

a = 1
for m in range(N+1, N+10):
  a *= m
for m in range(1, 10):
  a //= m

print(a%1000000007)
