import sys
from collections import deque

n = int(sys.stdin.readline())
d = deque()

for _ in range(n):
    cmd = sys.stdin.readline().split()

    if cmd[0] == "push":
        d.append(cmd[1])
    elif cmd[0] == "pop":
        if d:
            print(d[-1])
            d.pop()
        else:
            print("-1")
    elif cmd[0] == "size":
        print(len(d))
    elif cmd[0] == "empty":
        if d:
            print("0")
        else:
            print("1")
    elif cmd[0] == "top":
        if d:
            print(d[-1])
        else:
            print("-1")