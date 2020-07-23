n,k=map(int,input().split())


if n%2 == 1:
    print(min(n,k+1))
else:
    print(min(n//2, k+1))
