import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque()
for _ in range(n):
    cmd = list(map(str, sys.stdin.readline().rstrip().split()))
    command = cmd[0]
    if len(cmd) != 1:
        number = int(cmd[1])

    if command == "push":
        q.append(number)
    elif command == "pop":
        print(-1) if not q else print(q.popleft())
    elif command == "size":
        print(len(q))
    elif command == "empty":
        print(int(bool(not q)))
    elif command == "front":
        print(-1) if not q else print(q[0])
    elif command == "back":
        print(-1) if not q else print(q[-1])