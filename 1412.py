
A,B,C,D=map(int,input().split())

if A == C or B == D or (abs(A-C) + abs(B-D) <= 3):
    print(1)
else:
    print(2)
