
n = int(input())
m = int(input())

a = n//1000%m
head = 1
for h in range(a+1, m+1):
  head = head * h
base = 1
for b in range(1, m - a + 1):
  base = base * b 
print(head//base%1000000000)
