
a,b=map(int,input().split())

# large is 1
a,b=max(a,b), min(a,b)

tmp = ""
for f1, f2 in zip(["1"]*a,["0"]*b):
    tmp += f1 + f2
tmp += "1"*(a-b)

c = 0
for i in range(len(tmp)-1):
    if tmp[i:i+2] in {"10", "01"}:
        c += 1

print(c)
