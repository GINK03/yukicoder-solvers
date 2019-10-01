x,y,z = map(int,input().split())

if z >= y:
    z -= 1
if z >= x:
    z -= 1
print(z)
