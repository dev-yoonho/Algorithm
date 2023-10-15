import sys
from collections import deque

n = int(sys.stdin.readline())
number = deque([i for i in range(1, n + 1)])

while len(number) != 1:
    number.popleft()
    number.rotate(-1)

print(*number)