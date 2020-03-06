import numpy as np
import math
(height, width) = map(int, input().split())
b = np.zeros((height+2, width+2))
for h in range(height):
  for w, ch in enumerate(input()):
    if ch == '1':
      b[h+1,w+1] = 1.0
key_l2 = {}
for ww in [0, width+1]:
  for h in range(1, height+1):
    w = ww
    key = (h,w)
    for h2 in range(1, height+1):
      for w2 in range(1, width+1):
        if b[h2, w2] != 1.0: 
          continue
        if key_l2.get(key) is None:
          key_l2[key] = 0.0
        key_l2[key] += math.sqrt( (h - h2)**2 + (w - w2)**2 )
for hh in [0, height+1]:
  for w in range(1, width+1):
    h = hh
    key = (h,w)
    for h2 in range(1, height+1):
      for w2 in range(1, width+1):
        if b[h2, w2] != 1.0: 
          continue
        if key_l2.get(key) is None:
          key_l2[key] = 0.0
        key_l2[key] += math.sqrt( (h - h2)**2 + (w - w2)**2 )
if len(key_l2) > 0:
  print(min([f for key, f in key_l2.items()]))
else:
  print(0)
