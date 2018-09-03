s = [c for c in input()]
i, j = map(int, input().split())

s[i], s[j] = s[j], s[i]

print(''.join(s))
