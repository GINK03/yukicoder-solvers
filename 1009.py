
a,b = map(int,input().split())

a,b = sorted([a,b])

s = 0
for i in range(a*10000, b*10000):
    t = (i+1)/10000 - i/10000
    h = (i/10000 - a)*(i/10000 -b)
    if h <= 0:
        s += h * t
print(abs(s))
