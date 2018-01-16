N, D = map(int, input().split())

import fractions
def lcm(a,b): return abs(a * b) / fractions.gcd(a,b) if a and b else 0

print(int(lcm(N,D)/D - 1))
