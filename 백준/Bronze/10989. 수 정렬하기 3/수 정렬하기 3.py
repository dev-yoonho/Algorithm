import sys

n = int(sys.stdin.readline())
t = [0] * 10001
for _ in range(n):
    t[int(sys.stdin.readline())] += 1
for i in range(len(t)):
    if t[i] != 0:
        for _ in range(t[i]):
            print(i)