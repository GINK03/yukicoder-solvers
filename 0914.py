N,M,K=map(int,input().split())

prev_set = set([0])
for n in range(N):
    omiyages = list(map(int,input().split()))
    next_set = set()
    for omiyage in omiyages:
        for prev in prev_set:
            tmp = prev + omiyage
            if tmp == K:
                next_set.add(prev + omiyage)
                break
            elif tmp > K:
                continue
            else:
                next_set.add(prev + omiyage)
    prev_set = next_set

if len(prev_set) == 0:
    print(-1)
else:
    print(K-max(prev_set)) 
