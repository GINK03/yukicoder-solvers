l = int(input())
n = int(input())

import math

ans = []
for chars in input().split():
  a = math.pow(2, (l - len(chars)))
  ans.append( a )

print(int(sum(ans)))
