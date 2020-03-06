N = int(input()) %6
K = int(input())%2
d = {1:2, 2:8, 3:5, 4:7, 5:1, 0:4}
# 数学的証明 : https://yukicoder.me/problems/no/747/editorial
if (N==2 or N==5) and K==0:
  print(d[6-N])
else:
  print(d[N])
