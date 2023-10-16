import sys

n = int(sys.stdin.readline())
while n != 0:
    print(sum(range(1, n + 1)))
    n = int(sys.stdin.readline())