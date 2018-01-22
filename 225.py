
n, m = map(int, input().split())

ns = list(input())
ms = list(input())

cur = 0
swap_num = 0
while cur < len(ms):
  print(ns, cur, swap_num)

  if ns[cur] == ms[cur]:
    cur += 1
    continue
  if ns[cur] != ms[cur] and ns[cur] == ms[cur+1]:
    # insert 
    ns.insert(cur, ms[cur])
    swap_num += 1
    cur += 1
    continue
  if ns[cur] != ms[cur] and ns[cur] != ms[cur+1]:
    # replace
    ns[cur] = ms[cur]
    swap_num += 1
    cur += 1
    continue
 
print(ns)
print(ms)
