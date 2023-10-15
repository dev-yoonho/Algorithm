import sys

n = int(sys.stdin.readline())
f = []

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())
    f.append([x, y])

f.sort()
for i in f:
    print(*i)