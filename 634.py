

n = int(input())

k = 1 

sankakus = set()
while True:
  sankaku = int( k*(k+1)/2 )
  k += 1
  sankakus.add( sankaku )
  #print(sankaku)
  if sankaku > 10_000_000:
    break

matchs = []
n2 = n

for k in range(10):
  for i in range(0, -n2, -1):
    m = n2 + i
    print(m)
    if m in sankakus:
      matchs.append(m) 
      n2 -= m
      break
print(matchs)
  
