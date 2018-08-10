import datetime

format = '%Y/%m/%d'

delta = datetime.timedelta(days=+2)
time = datetime.datetime.strptime(input(), format)
print((time+delta).strftime('%Y/%m/%d'))
