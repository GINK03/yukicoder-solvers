
import math
n,x,a,b = [int(input()) for i in range(4)]
c = format(x, f'0{n}b')

# 補数表現
A = format(int('1'*n, 2)-a+1, f'0{n}b')
# 通常攻撃
ordinal = math.ceil( x/a )
# 最低ラインの定義
maxx = int('1'+'0'*(n-1), 2)
print( min(ordinal, math.ceil((maxx-x)/b)) )

