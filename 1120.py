n=int(input())

ax=list(map(int,input().split()))
bx=list(map(int,input().split()))

a=sum(ax)
b=sum(bx)

v=(a-b)/(len(ax) - 2)

p = [0]*len(ax)

print(v)


