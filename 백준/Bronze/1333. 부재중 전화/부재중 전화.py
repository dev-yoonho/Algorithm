import sys

n, l, d = map(int, sys.stdin.readline().split())
total = (n * l) + ((n - 1) * 5)
song = [False] * total
for i in range(0, total, l + 5):
    for j in range(i, i + l):
        song[j] = True
for i in range(0, total, d):
    if not song[i]:
        print(i)
        break
else:
    print(i + d)