S=input()
xs=set(S.split(','))
if len({'TLE', 'MLE', 'WA'} & xs) != 0:
    print('Failed...')
else:
    print('Done!')

