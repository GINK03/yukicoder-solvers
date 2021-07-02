
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
import collections
import functools
N=int(input())
ps=prime_factorize(N)
#print(ps)

r=functools.reduce(lambda x,y:x^y, collections.Counter(ps).values())

if r == 0:
    print("Bob")
else:
    print("Alice")
