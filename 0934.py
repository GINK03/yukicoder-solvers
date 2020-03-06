import os
from itertools import combinations
import random
import copy
n = int(input())
x = list(range(1,n+1))

try:
    def check(x, ch):
        if ch is not None:
            x.remove(ch)
        print(f'? {len(x)}')
        print(' '.join(map(str, x)))
        
        try:
            result = input()
            if result == '1':
                return True
            else:
                return False
        except:
            return True

    def trier(x):
        for ch in [None] + copy.copy(x):
            '''チェック'''
            if check(copy.copy(x), ch):
                if ch is not None:
                    x.remove(ch)
        return x

    ans = trier(x)

    print(f'! {len(ans)}')
    print(' '.join(map(str,ans)))
except Exception:
    ...
