
A, B, C = map(int, input().split())

nokori_moneys = {}
for a in range(A+1):
    for b in range(B+1):
        money = a + 10*b
        if money == 0:
            continue
        for item in range(1, money+1):
            nokori = money - item
            coins_ten, coins_one = divmod(nokori, 10)
            coins = A - a + coins_one + B - b + coins_ten
            if nokori_moneys.get(coins) is None:
                nokori_moneys[coins] = set()
            nokori_moneys[coins].add(item)
            
if nokori_moneys.get(C) is not None:
    print(min(nokori_moneys[C]))
else:
    print('Impossible')


