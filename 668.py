
text = input()

orig = round( int( text ), -1*len(text)+2 )

base = int( '1' + '0'*(len(text)-1) )

head = f'{orig/base:0.1f}'
pows = len(text)-1
if float(head) >= 10.0: 
  head = f'{float(head)/10.0:0.1f}'
  pows = len(text)

print( f'{head}*10^{pows}')

