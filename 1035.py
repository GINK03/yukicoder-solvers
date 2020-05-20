
from sys import setrecursionlimit
setrecursionlimit(1000000)


B = 10**9 + 7

N,M=map(int,input().split())


fac = [0]*(M+1)
fac[0]=1
for i in range(M):
    fac[i+1]=fac[i]*(i+1)%B

def comb(n,k):
    if n==0 and k==0:
        return 1
    if n<k or k<0:
        return 0
    return fac[n]*pow(fac[n-k],10**9+5,B)*pow(fac[k],10**9+5,B)%B

def f(i):
    if i==0:
        return 0
    return (comb(M,i)*pow(i,N,B)-f(i-1))%B

print(f(M))
