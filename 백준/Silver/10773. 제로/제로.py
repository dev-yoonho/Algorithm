import sys
from collections import deque

k = int(sys.stdin.readline())
stack = deque()

for _ in range(k):
    if (n := int(sys.stdin.readline())) == 0:
        stack.pop()
    else:
        stack.append(n)

print(sum(stack))