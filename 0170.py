from math import factorial as FT
from collections import Counter

s = input()

fall = 1
for t, f in Counter(s).items():
  fall *= FT(f)
print(int(FT(len(s))/fall)-1)
