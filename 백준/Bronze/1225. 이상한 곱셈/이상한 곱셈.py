import sys

a, b = sys.stdin.readline().split()
a, b = sum(map(int, a)), sum(map(int, b))
print(a*b)