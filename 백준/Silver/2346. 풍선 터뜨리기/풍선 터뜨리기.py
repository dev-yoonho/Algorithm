import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque(enumerate(map(int, sys.stdin.readline().split())))
while q:
    idx, number = q.popleft()
    print(idx + 1, end=" ")
    if number > 0:
        q.rotate(1 - number)
    elif number < 0:
        q.rotate(-number)