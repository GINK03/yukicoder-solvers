
N,Q=map(int,input().split())
S=input()

cs = [None for i in range(len(S)+1)]
cs[0] = [0]*26
chidx = [0]*26

for i,s in enumerate(S, 1):
    chidx[ord(s) - ord('a')] += 1 # 文字の累積和
    cs[i] = chidx[:] # コピーする

que = []
for q in range(Q):
    l,r,x=map(int,input().split())
    diff = [ri-li for ri,li in zip(cs[r], cs[l-1])]
    tmp = 0
    for i, d in enumerate(diff, ord('a')):
        tmp += d
        if tmp >= x:
            que.append(chr(i))
            break
print(*que,sep='\n')
