

V,T,P = map(int, input().split())

def is_ok(time):
    # 許容範囲ならTrue
    return (P+1) * V + (time-1)//T < time

def meguru(ng, ok):
    while (abs(ok - ng) > 1):
        mid = (ok + ng) // 2
        if is_ok(mid):
            ok = mid
        else:
            ng = mid
    return ok
ok = 10 ** 50
ng= 0
print(meguru(ng, ok))

