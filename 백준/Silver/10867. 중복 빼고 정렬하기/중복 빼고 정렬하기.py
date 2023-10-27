import sys

n = int(sys.stdin.readline())
arr = sorted(list(set(map(int, sys.stdin.readline().split()))))
for i in arr:
    print(i)