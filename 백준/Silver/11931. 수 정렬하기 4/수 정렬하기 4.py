import sys

n = int(sys.stdin.readline())
for i in sorted([int(sys.stdin.readline()) for _ in range(n)])[::-1]:
    print(i)