
x,y,h = map(int, input().split())
x *= 1000
y *= 1000


cnt = 0
while True:
    x, y = sorted([x,y])
    if x > h:
        x /= 2
        h *= 2
        cnt += 1
    elif y > h:
        y /= 2 
        h *= 2
        cnt += 1
    else:
        break
print(cnt)
