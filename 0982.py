A, B = map(int, input().split())

def factorization(n):
    ret = set()
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            ret.add(i)
    if temp!=1:
        ret.add(temp)
    if len(ret)==0:
        ret.add(n)
    return ret

a = factorization(A)
b = factorization(B)

if len(a & b) != 0:
    print(-1)
    exit()

N = A * B
# ここは見抜く必要がある、全探索でもいいが間に合うか不安である
print((A-1)*(B-1)//2)
