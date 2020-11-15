

"""
法則検証用
import re
s = "0100001"

for i in range(100):
    print(s)
    ne = s.replace("010", "101", 1)
    if ne == s:
        break
    s = ne
"""
    
N=int(input())

s = "0"*N
print("01" + s + "1")
