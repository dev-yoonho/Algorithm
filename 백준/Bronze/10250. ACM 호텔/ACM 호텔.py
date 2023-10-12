import sys

t = int(sys.stdin.readline())
for _ in range(t):
    h, w, n = map(int, sys.stdin.readline().split())
    a, b = divmod(n, h)
    if b == 0:
        b = h
        a -= 1
    print(b * 100 + a + 1)