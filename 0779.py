
ymd = [int(x) for x in input().split(' ')]

if 19890108 <= int(f'{ymd[0]}{ymd[1]:02d}{ymd[2]:02d}') <= 20190430:
    print('Yes')
else:
    print('No')
