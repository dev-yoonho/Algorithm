import sys
import heapq

n = int(sys.stdin.readline())
heap = []
for _ in range(n):
    x = int(sys.stdin.readline())
    if x != 0:
        heapq.heappush(heap, (abs(x), x))
    else:
        if heap:
            res = heapq.heappop(heap)
            print(res[1])
        else:
            print(0)