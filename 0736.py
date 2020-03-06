from fractions import gcd

n = int(input())

xs = [int(x) for x in input().split()]

gcd_val = gcd(xs[0], xs[1])

for x in xs[2:]:
  gcd_val = gcd(gcd_val, x)

#print(gcd_val)

xs = [str(x//gcd_val) for x in xs]

print( ':'.join(xs) )
