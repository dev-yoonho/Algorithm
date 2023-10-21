import sys

n = int(sys.stdin.readline())
for i in range(n, 0, -1):
    print(" " * (n - i) + "*" * (2 * i - 1))