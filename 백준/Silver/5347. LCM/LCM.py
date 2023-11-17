import sys

n = int(sys.stdin.readline())

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    temp = a * b
    if a < b:
        a, b = b, a
    while b != 0:
        a, b = b, a % b
    print(temp // a)