import heapq
Q, K = map(int, input().split())

s = []
low = []
high = []
for q in range(Q):
  line = input().strip()
  if line[0] == '1':
    _, val = map(int, line.split())
    heapq.heappush(low, -val)
    if len(low) == K:
      heapq.heappush(high, -heapq.heappop(low))
  if line[0] == '2':
    print(-1 if not high else heapq.heappop(high))
