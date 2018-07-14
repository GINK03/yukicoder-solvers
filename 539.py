import re

n = int(input())

#　正規表現で考えると、マッチしない文字列が多すぎて無理 
for i in range(n):
  s = input()
  # trim last
  lm = re.search(r'[a-zA-Z|=|-|\^|\s|\(|\)]{1,}$', s) 
  if lm is not None:
    last = lm.group(0)
  else:
    last = ""
  #print('last', last)
  s = re.sub(r'[a-zA-Z|=|-|\^|\s|\(|\)]{1,}$', '', s)
  #print(s)

  num = re.search(r'\d{1,}$', s)
  if num is not None:
    num = num.group(0)
    num_size = len(num)
    num_degit = f'0{num_size}d'
    num = int(num)
    num += 1
    num = f'{num:{num_degit}}' 
    #print(num)
    s = re.sub(r'\d{1,}$', num, s)

  s += last
  print(s)
