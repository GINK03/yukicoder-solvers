

buff = {1:1, 2:2, 3:3}

N = int(input())

#build

for i in range(3, N+1):
    buff[i] = buff[i-1] + buff[i-2]

print(buff[N])
