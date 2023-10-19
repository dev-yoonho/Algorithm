import sys

n = int(sys.stdin.readline())
p = sorted(list(map(int, sys.stdin.readline().split())))
t = 0
for i in range(len(p) + 1):
    t += sum(p[:i])

print(t)