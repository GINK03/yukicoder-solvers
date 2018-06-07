
def stack_machine(ss):
  ss = re.sub(r'^0{1,}', '', ss) 
  s = [ss[0]]
  for snext in ss[1:-1]:
    if s[-1] in ['+', '-'] and snext == '0':
      continue
    s.append( snext )
  s.append( ss[-1] )
  #print(s)
  return ''.join(s)

s = input()
import copy
import re
ss = [ s ]
ans = []
for i in range(len(s)):
  ss.append( ss[-1][1:] + ss[-1][0] )
  if ss[-1][0] not in ['+', '-'] and ss[-1][-1] not in ['+', '-']:
    ss_1 = stack_machine(ss[-1])
    #print(ss[-1], ss_1)
    try:
      ans.append( eval(ss_1) )
    except: ...
print(max(ans))

