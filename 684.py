
import numpy as np

n, lb, rb = map(int, input().split())

z = np.zeros( (1680+1,1280+1) ).astype(np.int16)

xs = set()

x_y_i = []
for i in range(n):
  target = i+1
  x1, y1, x2, y2 = map(int, input().split())
  x1 = max(x1,0)  
  x2 = min(x2, 1280)
  y1 = max(y1, 0)
  y2 = min(y2, 1680)
  #print(x1, x2)
  z[y2, x1:x2+1] = target
  
  xs.add( x1)
  xs.add( x2 )

  x_y_i.append( (x1, y1, i) )
  x_y_i.append( (x2, y2, i) )
match = set()
for x in xs:
  for dy in range(1680, 0-1, -1):
    if z[dy, x] != 0:
      print(z[dy,x], dy, x)
      match.add( z[dy, x] )
      break
    z[dy, x] = -1

#print(match)
for i in range(n):
  if i+1 in match:
    print(1)
  else:
    print(0)

