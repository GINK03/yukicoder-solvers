
#!/usr/bin/env python3
from itertools import islice
from time import time

def time_generator(func, n=500000):
  generator = func()
  start     = time()
  islice(generator, n)
  elapsed   = time() - start

  print("[%s] %0.9fs (%d iterations): " % (func.__name__, elapsed, n))

def prime_generator_pseudotest():
    """ A pseudo-prime testing trick in a generator expression """
    small_primes = (2, 3, 5, 7, 11)
    p = 2

    ps = set()
    for i in range(200000):
        if 0 not in (pow(w,p-1,p)==1 for w in small_primes if p > w):
            ps.add(p)
        p += 1
    return ps
    

a,b=5000,80000
ps = prime_generator_pseudotest()
ps = {p for p in ps if a <=p<=b}
#print(ps)


tmp = [i for i in range(a,b+1)]

for i in reversed(range(3,len(tmp))):
    m = min(tmp[i]%tmp[0], tmp[i]%tmp[1], tmp[i]%tmp[2], tmp[i]%tmp[i-1])
    tmp[i] = m
tmp[1]=1
print(tmp)

print(sum(tmp[1:]))
