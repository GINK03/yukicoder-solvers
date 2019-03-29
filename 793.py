N = int(input())
MOD = 1000000007
m = 4*pow(10, N, MOD) - 1

a = m%MOD
#print(a)
if a%3 == 1:
    print((a+MOD)//3)
elif a%3 == 2:
    print((a+2*MOD)//3)
else:
    print(a//3)
#print(a%3)



