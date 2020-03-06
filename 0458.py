
import sys, json, pickle
if '--prepare' in sys.argv:
  def approach3(givenNumber):  
      # Initialize a list
      primes = []
      for possiblePrime in range(2, givenNumber + 1):
          # Assume number is prime until shown it is not. 
          isPrime = True
          for num in range(2, int(possiblePrime ** 0.5) + 1):
              if possiblePrime % num == 0:
                  isPrime = False
                  break
          if isPrime:
              primes.append(possiblePrime)
      return(primes)
  primes = approach3(20000)
  print(primes)
  p_list = {}
  for prime1 in primes:
    for prime2 in primes:
      if prime1 == prime2:
        continue
      
      p = prime1 + prime2
      if p_list.get(p) is None:
        p_list[p] = set()
      p_list[p].add( tuple(sorted([prime1, prime2])) )

  print(p_list)
  pickle.dump(p_list, open('p_list.pkl', 'wb'))

p_list = pickle.load(open('p_list.pkl', 'rb'))

for p, lists in sorted(p_list.items(), key=lambda x:x[0]):
  print(p, list)
  ...
s = int(input())
if p_list.get(s) is None:
  print(-1)
  sys.exit()
ps = [ list(p) for p in p_list[s]]
print(ps)

for _ in range(30):
  for i in range(len(ps)):
    nexts = []
    for e in ps[i]:
      if p_list.get(e) is None: 
        nexts.append( e )
        print('not found ', e)
        continue
      
      for nes in p_list[e]:
          nexts += nes
    #print(ps[i], nexts)
    ps[i] = nexts
  print(ps)
