
n = int(input())
b = int(input())

xs = [float(x) for x in input().split()]
import math
f1 = [(x)*math.pow(b, x-1) for x in xs]
def integral(x):
  try:
    return math.pow(b, x+1)/(x+1)
  except Exception as ex:
    return math.log(b)
f2 = [integral(x) for x in xs]
print(sum(f1))
print(sum(f2))
