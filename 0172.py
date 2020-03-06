
import math

x, y, r = map(int, input().split())

x = abs(x)
y = abs(y)

dist = (x + y) / math.sqrt(2) + r

for i in range(1000):
  if dist < i/2*math.sqrt(2):
    print(i)
    break
