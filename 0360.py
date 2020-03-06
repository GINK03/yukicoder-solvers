import itertools
import sys
xs = list(map(int, input().split()))
for ps in itertools.permutations(xs, len(xs)):
  kc = []
  bs = []
  for i in range(0, len(ps)-2):
    slice = ps[i:i+3]
    if len(set(slice)) == 3 and (max(slice)  == slice[1] or min(slice) == slice[1]):
      kc.append(True)
    else:
      kc.append(False)
    bs.append(slice[0] < slice[2])

  if all(kc) and all(bs):
    print('YES')
    sys.exit() 

print('NO')
