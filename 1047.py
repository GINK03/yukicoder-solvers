a,b=map(int,input().split())

"""
x = A^n * x + (A^n + ... + A + 1) * Bと変形できるから、0を右辺が満たすには、

B = 0かつ、x = 0 (施行1)

A = -1かつ、 x= 1 (施行2)

以上に限定される
"""
if b == 0:
    print(1)
elif a == -1:
    print(2)
else:
    print(-1)


