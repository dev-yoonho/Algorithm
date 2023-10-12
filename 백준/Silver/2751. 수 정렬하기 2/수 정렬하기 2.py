import sys

n = int(sys.stdin.readline())
t = []
for _ in range(n):
    t.append(int(sys.stdin.readline()))
t = sorted(t)
for i in t:
    print(i)