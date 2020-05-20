n,k=map(int,input().split())

ao = list(map(int,input().split()))
ao.sort()
a = list(filter(lambda x:x>=0, ao))

if len(a[-k:]) == 0:
    print(ao[-1])
else:
    print(sum(a[-k:]))
