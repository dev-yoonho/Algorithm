import sys

m = int(sys.stdin.readline())
s = set()
for _ in range(m):
    temp = sys.stdin.readline().rstrip()
    if " " in temp:
        cmd, x = map(str, temp.split())
        x = int(x)
    else:
        cmd = temp
    if cmd == "add":
        if x not in s:
            s.add(x)
    elif cmd == "remove":
        if x in s:
            s.remove(x)
    elif cmd == "check":
        if x in s:
            print(1)
        else:
            print(0)
    elif cmd == "toggle":
        if x in s:
            s.remove(x)
        else:
            s.add(x)
    elif cmd == "all":
        s = set([i for i in range(1, 21)])
    elif cmd == "empty":
        s = set()