

n = int(input())

m = { 0:1 }

def fun(n):
  if m.get(n) is None:
    r = fun(n//3) + fun(n//5)
    m[n] = r
    return r
  else:
    return m[n]
fun(n)
print(m[n])
