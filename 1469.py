
s=input()
t=''
tmp=''
for ch in s:
    if ch == tmp:
        continue
    else:
        t+=ch
        tmp=ch

print(t)
