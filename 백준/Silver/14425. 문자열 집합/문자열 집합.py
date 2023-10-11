import sys

n, m = map(int, sys.stdin.readline().split())
s = set([sys.stdin.readline().rstrip() for _ in range(n)])

cnt = 0

for _ in range(m):
    t = sys.stdin.readline().rstrip()
    if t in s:
        cnt += 1

print(cnt)