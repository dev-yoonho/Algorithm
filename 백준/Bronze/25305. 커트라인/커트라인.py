import sys

n, k = map(int, sys.stdin.readline().split())
print(sorted(list(map(int, sys.stdin.readline().split())))[-k])