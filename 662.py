from collections import Counter
char_score = {}
chars = []
for i in range(5):
  char, score = input().split()
  char_score[char] = int(score)
  chars.append(char)
#print(char_score)
char_freq = {char:5 for char,score in char_score.items()}
Ns = []
for i in range(3):
  N = int(input())
  Ns.append(N)
  o = dict(Counter([input() for n in range(N)]))
  for char in chars:
    char_freq[char] *= o[char] if o.get(char) else 0
  
points = sum([char_freq[char]*char_score[char] for char in chars])
print(points/(Ns[0]*Ns[1]*Ns[2]))
for char in chars:
  print(char_freq[char])

