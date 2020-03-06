
N = int(input())
c, v = map(int, input().split())
  
s = 'A'
buff = None
cost = 0

from collections import namedtuple

items = []
Item = namedtuple('Item', ('cost', 's', 'buff') )
def copy_paste(s):
  global cost
  # copy 
  cost += c
  buff  = s
  # paste
  cost += v
  s += buff
  item = Item(cost, s, buff)
  items.append(item)
  #print(item)
  return s

for i in range(10):
  prev = s
  s = (copy_paste(s))
  if len(s) > N:
    break
#  print(s)
#print(cost)
##print(prev)
import math
costs  = []
for item in items[:-1]:
  cost = item.cost
  cost += v* math.ceil((N - len(item.s))/ len( item.buff ) )
  #print(item, (N-len(item.s)), len( item.buff ), item.cost, cost)
  costs.append(cost)
print(min(costs))
