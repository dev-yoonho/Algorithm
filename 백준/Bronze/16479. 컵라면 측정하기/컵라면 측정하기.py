import sys

k = int(sys.stdin.readline())
d1, d2 = map(int, sys.stdin.readline().split())
print(k ** 2 - ((d1 - d2) / 2) ** 2)