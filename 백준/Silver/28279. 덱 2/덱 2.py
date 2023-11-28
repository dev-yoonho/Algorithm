import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque()
for _ in range(n):
    cmd = sys.stdin.readline().rstrip()
    if len(cmd) != 1:
        command, x = map(int, cmd.split())
    else:
        command = int(cmd)

    if command == 1:
        q.appendleft(x)
    elif command == 2:
        q.append(x)
    elif command == 3:
        print(q.popleft()) if q else print(-1)
    elif command == 4:
        print(q.pop()) if q else print(-1)
    elif command == 5:
        print(len(q))
    elif command == 6:
        print(int(bool(not q)))
    elif command == 7:
        print(q[0]) if q else print(-1)
    elif command == 8:
        print(q[-1]) if q else print(-1)