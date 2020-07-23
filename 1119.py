
x,y,z=map(int,input().split())
if any(map(lambda x:x%3==0, [x,y,z])):
    print("Yes")
else:
    print("No")
