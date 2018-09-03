N, D, K = map(int, input().split()) 
import sys
xs = [(index, int(input())) for index, i in enumerate(range(N)) ] 
#print(xs)


def pmap(arg):
  key, starts = arg
  ans = []
  for start in starts:
    try:
      result = max( xs[start+1:min([start+D+1, len(xs)])], key=lambda x:x[1] ) 
      #print(result)
      r, l = xs[start], result
      delta = l[1] - r[1]
      tuple = (r[0], l[0])
      ans.append( (tuple, delta) )
      #sys.exit()
      #break
    except Exception as ex:
      print(ex)
  return ans

args = {}
for start in range(len(xs)-1):
  key = start%4
  if args.get(key) is None:
    args[key] = []
  args[key].append( start )
args = [(key,starts) for key, starts in args.items()]

from concurrent.futures import ProcessPoolExecutor as PPE
ans = []
with PPE(max_workers=4) as exe:
  for _ans in exe.map(pmap, args):
    for _a in _ans:
      ans.append(_a)

ans = sorted(ans, key=lambda x:x[1]*-1)

ans_size = ans[0][1]

ans = sorted( [a[0] for a in ans if a[1] == ans_size] )
if ans_size == 0:
  print(0)
else:
  print(ans_size*K)
  print(ans[0][0], ans[0][1])
