import sys

n = int(sys.stdin.readline())
m = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
m.sort(key = lambda x: x[0])
m.sort(key = lambda x: x[1])
for i in m:
    print(*i)