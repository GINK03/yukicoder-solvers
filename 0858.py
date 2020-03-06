from decimal import *
getcontext().prec = 100
A, B = map(lambda x: Decimal(int(x)), input().split())
s = f'{A/B:0.0100f}'

h, t = s.split('.')
t = t[:50]

print('.'.join([h, t]))
