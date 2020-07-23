def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-(n ** 0.5) // 1)) + 1):
        if temp % i == 0:
            cnt = 0
            while temp % i == 0:
                cnt += 1
                temp //= i
            arr.append([i, cnt])

    if temp != 1:
        arr.append([temp, 1])

    if arr == []:
        arr.append([n, 1])

    return arr

n=int(input())
fa = factorization(n)
a0 = 1
a1 = 1
# print(fa)
for p in fa:
    if p[1] == 1:
        a1 *= p[0]
    elif p[1]%2 == 0:
        a0 *= p[0] ** (p[1]//2)
    else:
        a1 *= p[0]
        a0 *= p[0] ** (p[1]//2)

print(a0, a1)
