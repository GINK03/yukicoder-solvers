m = int(input())

a = 1
for i in range(4):
    a *= 2**32%m 
    a %= m
print(a)
