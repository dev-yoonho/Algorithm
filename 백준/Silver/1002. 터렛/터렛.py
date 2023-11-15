import sys

t = int(sys.stdin.readline())
for _ in range(t):
    x1, y1, r1, x2, y2, r2 = map(int, sys.stdin.readline().split())
    d = ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5
    if d == 0:
        if r1 == r2:
            print(-1)
        else:
            print(0)
    else:
        if r1 + r2 == d or abs(r1 - r2) == d:
            print(1)
        elif abs(r1 - r2) < d < r1 + r2:
            print(2)
        else:
            print(0)