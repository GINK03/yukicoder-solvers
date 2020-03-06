
import json
query_result = {}
def f(x):
  if x == 0:
    return 0
  else:
    if query_result.get(x//2) is None:
      query_result[x//2] = f(x//2)
    return query_result[x//2] + x%2

q_sum = {}
def pmap(arg):
  global g_sum
  key, irange = arg
  for i in range(*irange):
    q = f(i)
    if q_sum.get(q) is None:
      q_sum[q] = {'count':0, 'sum':0}
    q_sum[q]['count'] += 1
    q_sum[q]['sum']   += i
  json.dump( q_sum, fp=open(f'tmp/{key:02d}.json', 'w'), indent=2)
  
args = {}
imax = 2147483647+1
#imax = 1000000000
step = imax//100000

for key, i in enumerate(range(0, imax, step)):
  args[key] = (i, i+step)
args = [(key, irange) for key, irange in args.items()]

from concurrent.futures import ProcessPoolExecutor as PPE
#pmap(args[0])
with PPE(max_workers=6) as ppe:
  ppe.map(pmap, args)
import sys
if '--join' in sys.argv:
  import glob
  for fn in glob.glob(''):
    ...
