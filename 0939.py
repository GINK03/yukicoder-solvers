
A,B=map(lambda x:f'{int(x):032b}',input().split())
#print(A, B)
# xor
c = [(a,b) for a, b in zip(A,B) if a != b]
c1 = [p for p in c if p == ('0','1')]
c2 = [p for p in c if p == ('1', '0')]
if len(c2) > 0:
    print(0)
elif len(c) == 0:
    print(1)
else:
    #print(c)
    print(2**len(c)//2)
