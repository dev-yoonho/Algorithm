import sys

t = int(sys.stdin.readline())
for _ in range(t):
    print(" ".join([i[::-1] for i in list(map(str, sys.stdin.readline().split()))]))