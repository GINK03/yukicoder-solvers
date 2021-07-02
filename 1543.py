
S,T,c = input().split()
if c == "=":
    c = "=="
if eval(f"{S} {c} {T}"):
    print("YES")
else:
    print("NO")
