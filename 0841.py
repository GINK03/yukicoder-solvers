s1, s2 = input().split()

if len([x for x in [s1, s2] if x in {'Sat', 'Sun'}]) == 2:
    print('8/33')
elif len({s1} & {'Sat', 'Sun'}) == 1:
    print('8/32')
else:
    print('8/31')
