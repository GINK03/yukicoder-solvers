
N = int(input())
strs = list(input())

count = 0
for i in range(N):
    for j in range(i+1, N):
        k = 2*j - i
        if k <= 0 or k >= N: continue
        if strs[i] == 'U' and strs[j] == 'M' and strs[k] == 'G':
            count += 1

print(count)
