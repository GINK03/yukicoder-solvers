N = int(input())
Ls = [int(x) for x in input().split()]
T = int(input())

compe_index = { compe:index for index, compe in enumerate('ABCDEFGHIJKLMNOPQRSTUVWXYZ') }

buff = {}
for t in range(T):
  name, compe = input().split()
  if buff.get(compe) is None: 
    buff[compe] = []
  buff[compe].append( (t, name) )

# ノーマライズ
norm = {}
for compe, data in buff.items():
  star_num = Ls[ compe_index[compe] ]
  data = [(star_num*50 + star_num * 50 / (0.8 + 0.2*(index+1)), tup[1]) for index, tup in enumerate(sorted(data, key=lambda x:x[0])) ]
  norm[compe] = data

#print(norm)
max_char = max( norm.keys() )
max_index = compe_index[ max_char ] 

name_series = {}
for compe, data in norm.items():
  for score, name in data:
    if name_series.get(name) is None:
      name_series[name] = []
    name_series[name].append( (compe, int(score) ) )

for name in list(name_series.keys()):
  obj = dict( name_series[name] )
  arr = []
  for compe, index in filter(lambda x:x[1] <= N-1, sorted(compe_index.items(), key=lambda x:x[1])):
    if obj.get(compe) is None:
      arr.append( 0 )
    else:
      arr.append( obj[compe] ) 
  name_series[name] = arr

tuples = []
for name in list(name_series.keys()):
  tuples.append( (name, ' '.join(map(str,name_series[name])), sum(name_series[name])) )
  
#print(name_series)
#print(tuples)
for index, tuple in enumerate(sorted(tuples, key=lambda x:x[2])):
  print(index+1, ' '.join(map(str, list(tuple))))
  



