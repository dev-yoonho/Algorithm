import sys

sys.stdin.readline()
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))
print(*sorted(a + b))