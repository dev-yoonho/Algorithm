import sys
from collections import deque

def bfs():
    global time
    q = deque()
    q.append(n)
    while q:
        x = q.popleft()
        if x == k:
            print(time[x])
            break
        for nx in (x - 1, x + 1, x * 2):
            if 0 <= nx <= 100000 and not time[nx]:
                time[nx] = time[x] + 1
                q.append(nx)
                
n , k = map(int, sys.stdin.readline().split())
time = [0] * 100001
bfs()