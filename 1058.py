
from math import sqrt
from collections import Counter

def prime_factorization(n):
    counter = Counter()
    for i in range(2, int(sqrt(n)) + 1):
        while n % i == 0:
            n //= i
            counter[i] += 1

    if n != 1:
        counter[n] += 1

    return list(counter.items())

def prime_factors(n):
    return set(map(lambda x: x[0], prime_factorization(n)))



import itertools

primes = []
cur = 10**5+1
while True:
    now = prime_factors(cur)
    if len(now) == 1:
        primes.append(cur)

    cur += 1
    if len(primes) == 10:
        break
ans = set([1])

#print(primes)
for p1,p2 in itertools.product(primes, repeat=2):
    a = p1*p2
    ans.add(a)
ans = list(ans)
ans.sort() 
#for a in ans:
#    print(a)

print(ans[int(input())-1])
