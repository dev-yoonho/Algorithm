import sys

n, m = map(int, sys.stdin.readline().split())
pw = dict()
for _ in range(n):
    a, b = map(str, sys.stdin.readline().split())
    pw[a] = b
for _ in range(m):
    print(pw[sys.stdin.readline().rstrip()])