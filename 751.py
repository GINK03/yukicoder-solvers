N1 = int(input())

a1, a2 = 1, 1
for index, v in enumerate(input().split()):
  v = int(v)
  key = index
  if key == 0:
    a1 *= v
  else:
    a2 *= v

N2 = int(input())
for index, v in enumerate(input().split()):
  v = int(v)
  key = index%2
  if key == 0:
    a2 *= v
  else:
    a1 *= v

from fractions import gcd
gcd = gcd(a1, a2)
print(int(a1/gcd), int(a2/gcd))

