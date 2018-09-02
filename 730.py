S = input()

ss = list(S)
from collections import Counter

obj = dict(Counter(ss))

freqs = [f == 1 for c,f in obj.items()]

if all(freqs):
  print('YES')
else:
  print('NO')
