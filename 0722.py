import math
import re
a, b = map(int, input().split() )

ah = re.search(r'^[1-9]{1,}', str(a))
if ah is None:
  ah = re.search(r'^\-[1-9]{1,}', str(a))
try:
  ah = ah.group()
except:
  ah = 0

bh = re.search(r'^[1-9]{1,}', str(b))
if bh is None:
  bh = re.search(r'^\-[1-9]{1,}', str(b))
try:
  bh = bh.group()
except:
  bh = 0

#print(ah, bh)

if 10 > abs(int(ah)) and 10 > abs(int(bh)) and  a != 10 and b != 10 and a%10 == 0 and b%10 == 0:
  r = a*b
  print(r//10)
else:
  r = a*b
  if len(str(r).replace('-','')) <= 8:
    print(r)
  else:
    print('E')

