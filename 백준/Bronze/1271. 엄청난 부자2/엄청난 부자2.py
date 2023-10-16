import sys

n, m = map(int, sys.stdin.readline().split())
a, b = divmod(n, m)
print(a)
print(b)