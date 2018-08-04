from collections import Counter

N,X = [int(x) for x in input().split()]
xs = [int(x) for x in input().split()]

keys  = set(xs)
count = Counter(xs)

sum = 0
for key in list(keys):
  if X-key in keys:
    sum += count[key]*count[X-key]

print(sum)
