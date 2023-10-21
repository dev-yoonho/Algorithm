import sys

a, b = map(int, sys.stdin.readline().split())
if a == b:
    print(0)
else:
    print(abs(b-a) - 1)
    for i in range(min(a, b) + 1, max(a, b)):
        print(i, end = " ")