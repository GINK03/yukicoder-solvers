
n = int(input())
netas = []
persons = []
for i in range(n):
  xs = [x for x in input().split()]
  xs[0] = int(xs[0])
  if xs[0] == 1:
    netas.append( xs[1] ) 
    is_match = False
    for index, neta in enumerate(netas):
      for person in persons:
        if neta in person[1]:
          person[1].remove(neta)
          is_match = (neta, person[0])
          break
      if is_match:
        break
    if is_match:
      print(is_match[1])
      netas.remove( is_match[0] )
    else:
      print(-1)
      nneta = list(reversed(netas))
      nneta.remove( xs[1] )
      nneta = list(reversed(nneta))
      netas = nneta
  elif xs[0] == 0:
    seki = int( xs[1] )
    persons.append( (seki, xs[3:]) )
    persons  = sorted(persons, key=lambda x:x[0])
  elif xs[0] == 2:
    seki = int( xs[1] )
    persons = [ person for person in persons if person[0] != seki ]

