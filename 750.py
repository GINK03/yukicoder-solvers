
N = int(input())

l = []
for n in range(N):
  key = input()
  left, right = map(int, key.split())
  l.append( (left/right, left, right) )

l = reversed(sorted(l, key=lambda x:x[0]))

for al in l:
  a,l,r = al
  print(f'{l} {r}')
