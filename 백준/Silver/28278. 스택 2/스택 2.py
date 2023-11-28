import sys

n = int(sys.stdin.readline())
stack = []
for _ in range(n):
    cmd = sys.stdin.readline().rstrip()
    if len(cmd) == 1:
        cmd = int(cmd)
    else:
        cmd, x = map(int, cmd.split())
    if cmd == 1:
        stack.append(x)
    elif cmd == 2:
        print(stack.pop()) if stack else print(-1)
    elif cmd == 3:
        print(len(stack))
    elif cmd == 4:
        print(1) if not stack else print(0)
    elif cmd == 5:
        print(stack[-1]) if stack else print(-1)