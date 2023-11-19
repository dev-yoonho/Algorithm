import sys

n = int(sys.stdin.readline())
temp = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
a = sorted([i[0] for i in temp])
b = sorted([j[1] for j in temp])
print((a[-1] - a[0]) * (b[-1] - b[0]))