import sys

c = 0
s = int(input())

buff = [s]
while True:
    #print(int(s), end=" ")
    if s == 1:
        break
    if s%2 == 0:
        s /= 2
        buff.append(s)
    else:
        s = 3*s + 1
        buff.append(s)
#print()
print(len(buff)-1)
print(int(max(buff)))


