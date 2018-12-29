
MOD = 10 ** 9 + 7
def cmb_gen(n):
    fac = [0] * n
    inv = [0] * n
    fac[0] = fac[1] = 1
    inv[0] = inv[1] = 1
    for i in range(2, n):
        fac[i] = (fac[i - 1] * i) % MOD
        inv[i] = pow(fac[i], MOD - 2, MOD)

    def cmb_mod(n, r):
        return (fac[n] * inv[n - r] * inv[r]) % MOD

    return cmb_mod

N = int(input())
xs = list(map(int, input().split()))
cmb_mod = cmb_gen(N)
r = 0
for i in range(N):
    r += xs[i] * cmb_mod(N-1, i)
    r %= MOD

print(r)


