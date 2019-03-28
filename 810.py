
L,R,M = map(int, input().split())

r = 0
if R - L >= M:
    r = M
else:
    r = R - L + 1 
print(r)
