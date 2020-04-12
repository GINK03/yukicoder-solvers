s = list(input())
t = list(input())

if len(t) == 1 and ''.join(t) in ''.join(s):
    print(-1)
    exit()

c = 0
while c < len(s):
    if s[c: c + len(t)] == t:
        s.insert(c + len(t) - 1, '.')
    c += 1

print(''.join(s).count('.'))
