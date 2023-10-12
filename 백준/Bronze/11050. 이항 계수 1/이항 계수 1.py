import sys
from itertools import combinations

n, k = map(int, sys.stdin.readline().split())
up, down, minus = 1, 1, 1
for i in range(1, n + 1):
    up *= i
for j in range(1, k + 1):
    down *= j
for l in range(1, n - k + 1):
    minus *= l
print(up // (down * minus))