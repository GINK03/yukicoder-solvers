
n, k = map(int, input().split(' '))

xs = []
for i in range(n):
  xs.append( int( input() ) )

fullbin = f'1'*len(xs)
#print(fullbin)

ss = []
size = len(fullbin)
for i in range(0,int(fullbin,2)+1):
  #print(i)
  filt = f'{i:020b}'[-1*size:]
  #print(filt)
  s = sum( [ x for f, x in zip(filt, xs) if f == '1' ] )
  ss.append( s )

m = max(filter(lambda x:x <= k, ss))
print(m)
