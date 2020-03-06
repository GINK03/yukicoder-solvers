

xs = list(map(int, input().split()))
xs = sorted(xs)
m = xs[0]
xs = list(map(lambda x:x - m, xs))

if xs == [0, 1, 2, 3]:
    print("Yes")
else:
    print("No")
