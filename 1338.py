import collections
H,W,Q=map(int, input().split())

max_s = H*W
rank = collections.defaultdict(lambda :H)
for _ in range(Q):
    y,x=map(int,input().split())
    x-=1; y-=1
    if y < rank[x]:
        delta = rank[x] - y
        max_s -= delta
        print(max_s)
        rank[x] = y
    else:
        print(max_s)
         
    
# print(rank)
