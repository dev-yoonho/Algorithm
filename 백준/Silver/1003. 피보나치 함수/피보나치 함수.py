import sys

t = int(sys.stdin.readline())
for _ in range(t):
    n = int(sys.stdin.readline())
    zero, one = 1, 0
    for _ in range(n):
        zero, one = one, zero + one
    print(zero, one)