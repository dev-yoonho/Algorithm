import sys

a1, a0 = map(int, sys.stdin.readline().split())
c = int(sys.stdin.readline())
n = int(sys.stdin.readline())

if n * a1 + a0 <= c * n and a1 <= c:
    print(1)
else:
    print(0)