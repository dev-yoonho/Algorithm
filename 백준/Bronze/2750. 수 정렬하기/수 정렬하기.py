import sys

n = int(sys.stdin.readline())
for i in sorted([int(sys.stdin.readline()) for _ in range(n)]):
    print(i)