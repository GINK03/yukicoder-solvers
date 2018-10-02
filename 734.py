import math

a, b, c = map(int, input().split())

cal = ( 3600*c / (60*a - b) )

if cal < 0:
  print(-1)
else:
  print( math.ceil(cal) )
