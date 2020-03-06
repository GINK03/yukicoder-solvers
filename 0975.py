tar, s1, s2 = input().split()

s1s = set(input().split())
s2s = set(input().split())

if tar in s1s and tar in s2s:
    print("MrMaxValu")
elif tar in s1s:
    print("MrMax")
elif tar in s2s:
    print("MaxValu")
else:
    print(-1)
