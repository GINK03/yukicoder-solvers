
A, B, C, D = map(int,input().split())
p = 0

b = [ 0 for i in range(600+1)]
for i in range(1, B+1):
  if 600 >= i > 500:
    b[i] = 32*50
  if 500 >= i > 400:
    b[i] = 16*50
  if 400 >= i > 300:
    b[i] = 8*50
  if 300 >= i > 200:
    b[i] = 4*50
  if 200 >= i > 100:
    b[i] = 2*50
  if 100 >= i:
    b[i] = 1*50
  
a = [ 0 for i in range(800+1)]
for i in range(B+1, B+A+1):
  if 800 >= i > 700:
    a[i] = 128*100
  if 700 >= i > 600:
    a[i] = 64*100
  if 600 >= i > 500:
    a[i] = 32*100
  if 500 >= i > 400:
    a[i] = 16*100
  if 400 >= i > 300:
    a[i] = 8*100
  if 300 >= i > 200:
    a[i] = 4*100
  if 200 >= i > 100:
    a[i] = 2*100
  if 100 >= i:
    a[i] = 1*100
#print(sum(a))

if D >= 10:
  print('Impossible')
  exit()

print('Possible')
print(sum(a) + sum(b))
