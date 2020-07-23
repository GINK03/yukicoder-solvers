l,r,m,k=map(int,input().split())

l,r=k*l,k*r

max_prob=r-r%m

if l <= max_prob:
    print("Yes")
else:
    print("No")
