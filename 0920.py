x, y, z = map(int,input().split())

delta = abs(x-y)
if z - delta <= 0:
    m = min(x, y)
    print(m + z)
    #print(1)
    exit()
if z - delta > 0:
    z = z - delta
    z //= 2
    print(max(x,y) + z)
    #print(2)
    exit()
