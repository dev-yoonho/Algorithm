import sys

t = int(sys.stdin.readline())
for i in range(t):
    arr = sorted(list(map(int, sys.stdin.readline().split())))
    print(arr[-3])