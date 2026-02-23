import sys

input = sys.stdin.readline

t = int(input().rstrip())

for _ in range(t):
    n, d = map(int, input().split())

    sum = 0

    for _ in range(n):
        v, f, c = map(int, input().split())

        if (d / v * c) <= f:
            sum += 1

    print(sum)