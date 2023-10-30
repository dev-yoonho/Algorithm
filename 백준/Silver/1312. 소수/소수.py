import sys

a, b, n = map(int, sys.stdin.readline().split())
a %= b
for _ in range(n - 1):
    a = (a * 10) % b
print((a * 10) // b)