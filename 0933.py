count = 1
n=int(input())
if n==0:
    print(0)
    exit()
P=list(map(int,input().split()))
for i in range(n):
    if P[i]==0:
        print(0)
        exit()
    count*=P[i]%9
count%=9
if count==0:
    print(9)
else:
    print(count)
