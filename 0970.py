n = int(input())
ys = list(map(lambda x:int(x), input().split()))

sum = sum(ys)

size = len(ys)
for i in range(size):
    a  = sum - ys[i]*(size-1)
    print(a, end=" ")
print()
