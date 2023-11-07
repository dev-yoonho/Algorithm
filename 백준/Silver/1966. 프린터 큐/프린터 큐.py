import sys
from collections import deque

t = int(sys.stdin.readline())
for _ in range(t):
    n, m = map(int,sys.stdin.readline().split())
    q = deque(list(map(int, sys.stdin.readline().split())))
    cnt = 0
    while q:
        MAX = max(q)
        front = q.popleft()
        m -= 1
        if MAX == front:
            cnt += 1
            if m < 0:
                print(cnt)
                break
        else:
            q.append(front)
            if m < 0:
                m = len(q) - 1