
s = input()

def caps(ch):
  if ch == ch.lower():
    return ch.upper()
  else:
    return ch.lower()
xs = [caps(ch) for ch in s]
print(''.join(xs))
